package dev.boris.kite.models

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TimeEntry(
    val id: Int,
    @SerialName("user_id")
    val userId: Int,
    @SerialName("user_name")
    val userName: String,
    @SerialName("date_at")
    val dateAt: LocalDate,
    @SerialName("started_time")
    val startedTime: Int?, // in minutes, e.g. 540 = 9am
    val minutes: Int,
    val note: String,
    @SerialName("customer_id")
    val customerId: Int?,
    @SerialName("customer_name")
    val customerName: String?,
    @SerialName("project_id")
    val projectId: Int?,
    @SerialName("project_name")
    val projectName: String?,
    @SerialName("service_id")
    val serviceId: Int?,
    @SerialName("service_name")
    val serviceName: String?,
    val billable: Boolean,
    val revenue: Double?,
    @SerialName("hourly_rate")
    val hourlyRate: Int,
    @SerialName("created_at")
    val createdAt: Instant,
    @SerialName("updated_at")
    val updatedAt: Instant,
    val locked: Boolean,
)

@Serializable
internal data class TimeEntryWrapper(@SerialName("time_entry") val timeEntry: TimeEntry)