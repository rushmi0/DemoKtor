package org.camrent.database.field

import kotlinx.serialization.Serializable

@Serializable
data class ProductsField(
    val productID: String,
    val productName: String,
    val image1: String,
    val image2: String,
    val image3: String,
    val image4: String,
    val type: String,
    val price: Int,
    val specDetail: String,
    val desc: String,
    val productStats: String,
    val storeID: String
)
