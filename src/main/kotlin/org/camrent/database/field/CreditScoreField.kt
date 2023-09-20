package org.camrent.database.field

import kotlinx.serialization.Serializable

@Serializable
data class CreditScoreField(
    val scoreID: String,
    val score: Int,
    val report: String,
    val storeID: String,
    val customerID: String
)
