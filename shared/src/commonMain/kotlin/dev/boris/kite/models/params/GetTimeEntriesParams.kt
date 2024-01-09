package dev.boris.kite.models.params

import dev.boris.kite.models.enums.GroupBy
import dev.boris.kite.models.enums.OrderBy
import dev.boris.kite.models.enums.SortBy
import kotlinx.datetime.LocalDate

data class GetTimeEntriesParams(
    val userIds: Array<Int>,
    val customerId: Int?,
    val projectId: Int?,
    val serviceId: Int?,
    val notes: Array<String>?,
    val at: LocalDate?,
    val from: LocalDate?,
    val to: LocalDate?,
    val billable: Boolean?,
    val locked: Boolean?,
    val tracking: Boolean?,
    val sort: SortBy?,
    val direction: OrderBy?,
    val groupBy: GroupBy?,
    val limit: Int?,
    val page: Int?,
)