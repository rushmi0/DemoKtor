package org.camrent.database.menage.table

import org.jetbrains.exposed.sql.Table

object OrderContractธTable : Table("OrderContract") {

    val oderID = varchar("OderID", 256)
    val quantity = integer("Quantity",)
    val duration = integer("Duration")
    val customerID = varchar("CustomerID", 256).references(CustomersTable.customerID)
    val addressID = varchar("AddressID", 256).references(AddressesTable.addressID)
    val productID = varchar("ProductID", 256).references(ProductsTable.productID)

    override val primaryKey = PrimaryKey(oderID)
}