package org.camrent.database.forms

import kotlinx.serialization.Serializable

@Serializable
data class TransactionsForm(
    val txID: String,
    val totalPrice: String,
    val status: String,
    val timeSpam: String,
    val date: String,
    val orderID: String
)
