package org.camrent.database.menage.table

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.datetime

object FineTable : Table("Fine") {
    val fineID = varchar("FineID", 256)
    val timeSpam = datetime("TimeSpam")
    val date = datetime("Date")
    val description = varchar("Description", 256)
    val image1 = varchar("Image1", 256)
    val image2 = varchar("Image2", 256)
    val image3 = varchar("Image3", 256)
    val image4 = varchar("Image4", 256)
    val penaltyFee = integer("PenaltyFee")
    val status = varchar("Status", 256)
    val storeID = varchar("StoreID", 256).references(StoresTable.storeID)
    val productID = varchar("ProductID", 256).references(ProductsTable.productID)
    val customerID = varchar("CustomerID", 256).references(CustomersTable.customerID)

    override val primaryKey = PrimaryKey(fineID)
}