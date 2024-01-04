package dev.boris.kite.models

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class AccountTest {

    companion object {
        const val INPUT = """{
    "account": {
        "id": 117571,
        "name": "2orgu",
        "title": "2OrgU",
        "currency": "EUR",
        "created_at": "2023-01-02T12:19:38+01:00",
        "updated_at": "2023-12-21T01:00:07+01:00"
    }
}"""
    }

    @Test
    fun shouldParseContent() {
        println(AccountWrapper.serializer().descriptor)
        println(Account.serializer().descriptor)
        val account = Json.decodeFromString<AccountWrapper>(INPUT).account
        assertEquals(account.id, 117571)
    }

    @Test
    fun shouldSerializeContent() {
        val account = Account(
            117571,
            "2orgu",
            "2OrgU",
            "EUR",
            LocalDateTime(2023, 1, 2, 12, 19, 38).toInstant(TimeZone.of("UTC+1")),
            LocalDateTime(2023, 12, 21, 1, 0, 7).toInstant(TimeZone.of("UTC+1"))
        )
        println(Json { prettyPrint = true }.encodeToString(AccountWrapper(account)))
    }
}