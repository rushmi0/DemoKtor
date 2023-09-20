package org.camrent.database.field

import kotlinx.serialization.Serializable

@Serializable
data class AddressesField(
    val addressID: String,
    val locationName: String,
    val city: String,
    val province: String,
    val postalNumber: String,
    val streetName: String
)
