package org.camrent.database.service

data class PeopleForm(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val addressID: String
)
