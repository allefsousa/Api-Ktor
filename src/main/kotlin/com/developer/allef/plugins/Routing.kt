package com.developer.allef.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        get("/") {
            println("URI: ${call.request.uri}")
            println("Headers: ${call.request.headers.names()}")
            println("Query Params ${call.request.queryParameters.names()}")
            println("Query Params ${call.request.queryParameters.names()}")
            println("Query Params ${call.request.queryParameters["name"]}")
            call.respondText("Hello World!")
            call.application
        }
    }
}
