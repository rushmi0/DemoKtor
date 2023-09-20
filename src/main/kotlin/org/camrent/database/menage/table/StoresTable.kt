package org.camrent.database.menage.table

import org.jetbrains.exposed.sql.Table

object StoresTable : Table("Stores") {

    val storeID = varchar("StoreID", 256)
    val storeName = varchar("StoreName", 256)
    val profileImage = varchar("ProfileImage", 256)
    val paymentMethod = varchar("PaymentMethod", 256)
    val authKey = varchar("AuthKey", 256)
    val createAt = varchar("CreateAccount", 256)
    val personID = varchar("PersonID", 256).references(PeopleTable.personID)

    override val primaryKey = PrimaryKey(storeID)
}