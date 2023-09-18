package org.camrent.database.menage.table

import org.jetbrains.exposed.sql.Table

object ProductsTable : Table("Products") {
    val productID = varchar("ProductID", 256)
    val productName = varchar("ProductName", 256)
    val image1 = varchar("Image1", 256)
    val image2 = varchar("Image2", 256)
    val image3 = varchar("Image3", 256)
    val image4 = varchar("Image4", 256)
    val type = varchar("Type", 256)
    val price = integer("Price")
    val specDetail = varchar("SpecDetail", 256)
    val desc = varchar("DESC", 256)
    val productStatus = varchar("ProductStatus", 256)
    val storeID = varchar("StoreID", 256).references(StoresTable.storeID)

    override val primaryKey = PrimaryKey(productID)
}