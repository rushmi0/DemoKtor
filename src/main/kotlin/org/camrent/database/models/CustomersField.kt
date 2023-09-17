package org.camrent.database.models

data class CustomersField(
    val customerID: String,
    val userName: String,
    val profileImage: String,
    val authKey: String? = null,
    val personID: String
)
