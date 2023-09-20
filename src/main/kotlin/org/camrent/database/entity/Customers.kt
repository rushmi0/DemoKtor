package org.camrent.database.entity

import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.camrent.database.menage.Database

fun Application.customerRoute() {
    val db = Database.initialize()

    routing {
        get("/customer") {
            val user = db
        }
    }

}