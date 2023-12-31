package org.camrent.database.menage.table


import org.jetbrains.exposed.sql.Table

object CustomersTable : Table("Customers") {

    val customerID = varchar("CustomerID", 256)
    val userName = varchar("UserName", 256).uniqueIndex()
    val profileImage = varchar("ProfileImage", 256)
    val authKey = varchar("AuthKey", 256)
    val createAt = varchar("CreateAccountDate", 256)
    val personID = varchar("PersonID", 256).references(PeopleTable.personID).uniqueIndex()

    override val primaryKey = PrimaryKey(customerID)
}