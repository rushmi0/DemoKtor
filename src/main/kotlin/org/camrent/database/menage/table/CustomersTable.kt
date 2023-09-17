package org.camrent.database.menage.table

import org.camrent.database.menage.table.AddressesTable.references
import org.jetbrains.exposed.sql.Table

object CustomersTable : Table("Customers") {

    val customerID = varchar("CustomerID", 256)
    val userName = varchar("UserName", 256)
    val profileImage = varchar("ProfileImage", 256)
    val authKey = varchar("AuthKey", 256)
    val personID = varchar("PersonID", 256).references(PeopleTable.personID)

    override val primaryKey = PrimaryKey(customerID)
}