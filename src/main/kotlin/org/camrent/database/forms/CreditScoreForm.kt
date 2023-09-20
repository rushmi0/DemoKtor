package org.camrent.database.forms

import kotlinx.serialization.Serializable


@Serializable
data class CreditScoreForm(
    val scoreID: String,
    val score: Int,
    val report: String,
    val storeID: String,
    val customerID: String
)
