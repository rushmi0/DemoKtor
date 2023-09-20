package org.camrent.database.field

import kotlinx.serialization.Serializable

@Serializable
data class PeopleField(
    val personID: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val addressID: String
)
