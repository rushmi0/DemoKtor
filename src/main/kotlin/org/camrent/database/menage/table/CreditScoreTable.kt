package org.camrent.database.menage.table

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.datetime

object CreditScoreTable : Table("CreditScore") {
    val scoreID = varchar("ScoreID", 256)
    val score = integer("Score")
    val report = varchar("Report", 256)
    val storeID = varchar("StoreID", 256).references(StoresTable.storeID)
    val customerID = varchar("CustomerID", 256).references(CustomersTable.customerID)

    override val primaryKey = PrimaryKey(scoreID)
}