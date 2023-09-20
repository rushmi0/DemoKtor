package org.camrent.database.field

import kotlinx.serialization.Serializable

@Serializable
data class OrderContractField(
    val oderID: String,
    val quantity: Int,
    val duration: Int,
    val customerID: String,
    val addressID: String,
    val productID: String
)
