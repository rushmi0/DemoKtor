package org.camrent.database.forms

import kotlinx.serialization.Serializable

@Serializable
data class AddressesForm(
    val addressID: String,
    val locationName: String,
    val city: String,
    val province: String,
    val postalNumber: String,
    val streetName: String
)
