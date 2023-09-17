package org.camrent.database.menage

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

import org.camrent.database.menage.table.AddressesTable
import org.camrent.database.menage.table.PeopleTable


object Database {

    fun initialize() {
        Database.connect(hikariConfig())
        transaction {
            SchemaUtils.create(PeopleTable)
            SchemaUtils.create(AddressesTable)
        }
    }

    private fun hikariConfig(): HikariDataSource {

        // สร้างอ็อบเจกต์ HikariConfig สำหรับกำหนดค่าการเชื่อมต่อ HikariCP
        val config = HikariConfig()

        // กำหนดชื่อไดรเวอร์ของฐานข้อมูล
        config.driverClassName = "org.sqlite.JDBC"

        // กำหนด URL สำหรับการเชื่อมต่อกับฐานข้อมูล SQLite
        config.jdbcUrl = "jdbc:sqlite:src/main/kotlin/org/camrent/database/menage/MyDatabase.db"

        // กำหนดขนาดสูงสุดของพูลการเชื่อมต่อ
        config.maximumPoolSize = 5

        // กำหนดให้ไม่ทำ Auto Commit โดยอัตโนมัติ
        config.isAutoCommit = false

        // กำหนดระดับการแยกธุรกรรม (Transaction Isolation) เป็น TRANSACTION_REPEATABLE_READ
        config.transactionIsolation = "TRANSACTION_REPEATABLE_READ"

        // ตรวจสอบความถูกต้องของค่าการกำหนดค่า
        config.validate()

        // สร้างและคืนค่าอ็อบเจกต์ HikariDataSource ที่กำหนดค่า
        return HikariDataSource(config)
    }


}