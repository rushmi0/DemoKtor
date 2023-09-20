package org.camrent.database.forms

import kotlinx.serialization.Serializable

@Serializable
data class StoresForm(
    val storeID: String,
    val storeName: String,
    val profileImage: String,
    val paymentMethod: String,
    val authKey: String,
    val personID: String
)
