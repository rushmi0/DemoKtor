package org.camrent.database.service

import org.camrent.database.forms.CustomersForm
import org.camrent.database.menage.Database.dbQuery
import org.camrent.database.menage.table.CustomersTable
import org.camrent.database.field.CustomersField
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.statements.InsertStatement

class CustomerServiceImpl : CustomerService {

    override suspend fun signupCustomer(form: CustomersForm): CustomersField? {
        var statement: InsertStatement<Number>? = null
        // เริ่มกระบวนการทำงานแบบ Transaction ของฐานข้อมูล
        dbQuery {
            // สร้างและ execute INSERT statement เพื่อบันทึกข้อมูลลูกค้าใหม่ลงในฐานข้อมูล
            statement = CustomersTable.insert {
                it[customerID] = form.customerID
                it[userName] = form.userName
                it[profileImage] = form.profileImage
                it[personID] = form.personID
            }
        }

        // คืนค่า CustomersField จากผลลัพธ์ของ INSERT statement
        return statement?.resultedValues?.get(0)?.let { rowCustomers(it) }
    }


    // ฟังก์ชันสำหรับค้นหาข้อมูลลูกค้าจากชื่อผู้ใช้
    override suspend fun findUserByUserName(userName: String): CustomersField? {
        // ค้นหาข้อมูลลูกค้าจากชื่อผู้ใช้
        return dbQuery {
            // ค้นหาข้อมูลลูกค้าจากฐานข้อมูล
            CustomersTable.select { CustomersTable.userName.eq(userName) }
                .mapNotNull { rowCustomers(it) } // แปลงผลลัพธ์ให้เป็น `List` และกรองค่าที่ไม่ใช่ `null`
                .singleOrNull() // คืนผลลัพธ์เดียวจาก `List` หรือ `null` ถ้าไม่พบข้อมูล
        }
    }


    private fun rowCustomers(row: ResultRow?): CustomersField? {
        // ใช้ `let` จัดการผลลัพธ์ที่อาจเป็น `null` เพราะมันจะไม่ทำงานถ้า `row` เป็น `null`
        // เพื่อเข้าถึงข้อมูลใน ResultRow และสร้าง CustomersField object
        return row?.let {
            CustomersField(
                customerID = it[CustomersTable.customerID],
                userName = it[CustomersTable.userName],
                profileImage = it[CustomersTable.profileImage],
                personID = it[CustomersTable.personID]
            )
        }
    }

}