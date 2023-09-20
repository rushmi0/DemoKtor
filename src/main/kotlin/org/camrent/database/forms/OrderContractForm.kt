package org.camrent.database.forms

import kotlinx.serialization.Serializable

@Serializable
data class OrderContractForm(
    val oderID: String,
    val quantity: Int,
    val duration: Int,
    val customerID: String,
    val addressID: String,
    val productID: String
)
