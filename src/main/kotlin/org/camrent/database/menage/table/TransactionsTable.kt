package org.camrent.database.menage.table

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.datetime

object TransactionsTable : Table("Transactions") {

    val txID = varchar("TxID", 256)
    val totalPrice = varchar("TotalPrice", 256)
    val status = varchar("Status", 256)
    val timeSpam = datetime("TimeSpam")
    val date = datetime("Date")
    val orderID = varchar("OrderID", 256).references(OrderContractTable.orderID)

    override val primaryKey = PrimaryKey(txID)
}