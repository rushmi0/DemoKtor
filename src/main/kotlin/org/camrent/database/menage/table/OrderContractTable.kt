package org.camrent.database.menage.table

import org.jetbrains.exposed.sql.Table

object OrderContractTable : Table("OrderContract") {

    val orderID = varchar("OrderID", 256)
    val quantity = integer("Quantity").default(0)
    val duration = integer("Duration").default(0)
    val customerID = varchar("CustomerID", 256).references(CustomersTable.customerID)
    val addressID = varchar("AddressID", 256).references(AddressesTable.addressID)
    val productID = varchar("ProductID", 256).references(ProductsTable.productID)

    override val primaryKey = PrimaryKey(orderID)
}
