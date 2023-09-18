package org.camrent.database.forms

data class StoresForm(
    val storeID: String,
    val storeName: String,
    val profileImage: String,
    val paymentMethod: String,
    val authKey: String,
    val personID: String
)
