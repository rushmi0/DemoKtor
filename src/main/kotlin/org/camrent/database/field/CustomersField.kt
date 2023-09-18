package org.camrent.database.field

data class CustomersField(
    val customerID: String,
    val userName: String,
    val profileImage: String,
    val authKey: String? = null,
    val personID: String
)
