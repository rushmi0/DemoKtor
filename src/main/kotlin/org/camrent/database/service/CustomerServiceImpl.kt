package org.camrent.database.service

import org.camrent.database.menage.Database.dbQuery
import org.camrent.database.menage.table.CustomersTable
import org.camrent.database.models.CustomersField
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.statements.InsertStatement

class CustomerServiceImpl : CustomerService {

    override suspend fun signupCustomer(form: CustomersForm): CustomersField? {
        var statement: InsertStatement<Number>? = null
        dbQuery {
            statement = CustomersTable.insert {
                it[customerID] = form.customerID
                it[userName] = form.userName
                it[profileImage] = form.profileImage
                it[personID] = form.personID
            }
        }
        return statement?.resultedValues?.get(0)?.let { rowCustomers(it) }
    }


    override suspend fun findUserByUserName(userName: String): CustomersField? {
        return dbQuery {
            CustomersTable.select { CustomersTable.userName.eq(userName) }
                .mapNotNull { rowCustomers(it) }
                .singleOrNull()
        }
    }


    private fun rowCustomers(row: ResultRow?): CustomersField? {
        // ใช้ let เพราะมันจะไม่ทำงานถ้า row เป็น null
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