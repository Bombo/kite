package dev.boris.kite.models

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Account(
    val id: Int,
    val name: String,
    val title: String,
    val currency: String,
    @SerialName("created_at")
    val createdAt: Instant,
    @SerialName("updated_at")
    val updatedAt: Instant,
)

@Serializable
internal data class AccountWrapper(val account: Account)