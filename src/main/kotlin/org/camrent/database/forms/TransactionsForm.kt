package org.camrent.database.forms

data class TransactionsForm(
    val txID: String,
    val totalPrice: String,
    val status: String,
    val timeSpam: String,
    val date: String,
    val orderID: String
)
