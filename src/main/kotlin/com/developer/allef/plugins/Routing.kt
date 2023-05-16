package com.developer.allef.plugins

import com.developer.allef.model.UserInfo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


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
        get("/iphones/{page}"){
            val pageNumber = call.parameters["page"]
            call.respondText("Your are on page number: $pageNumber")
        }

        post("/login"){

            val user = call.receive<UserInfo>()
            call.respondText("Usuario recebido com sucesso ${user.user + "Pasword"+ user.password}", status = HttpStatusCode.Created)
        }

        get("/login"){
            val obj = UserInfo("allef","123")
            call.respond(obj)
        }

        get("/headers"){
            call.response.headers.append("server-name", "KtorServer")
            call.response.headers.append("Chocolate", "I love it")
            call.respondText("Headers added")
        }
    }
}