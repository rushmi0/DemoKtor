package org.camrent.database.forms

import kotlinx.serialization.Serializable

@Serializable
data class PeopleForm(
    val peopleID: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val addressID: String
)
