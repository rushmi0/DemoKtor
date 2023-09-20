package org.camrent.database.forms

import kotlinx.serialization.Serializable

@Serializable
data class CustomersForm(
    val customerID: String,
    val userName: String,
    val profileImage: String,
    val authKey: String,
    val personID: String
)
