package com.developer.allef

import io.ktor.client.request.*
import io.ktor.server.testing.*
import kotlin.test.Test

class ContactUsModuleKtTest {

    @Test
    fun testGetContactus() = testApplication {
        application {
            module()
        }
        client.get("/contactUs").apply {
            TODO("Please write your test here")
        }
    }
}