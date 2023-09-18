package org.camrent.database.forms

data class OrderContractForm(
    val oderID: String,
    val quantity: Int,
    val duration: Int,
    val customerID: String,
    val addressID: String,
    val productID: String
)
