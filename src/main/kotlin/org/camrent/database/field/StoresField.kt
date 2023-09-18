package org.camrent.database.field

data class StoresField(
    val storeID: String,
    val storeName: String,
    val profileImage: String,
    val paymentMethod: String,
    val authKey: String,
    val personID: String
)
