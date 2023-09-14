package org.camrent.test

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.hello() {

    routing {

        get ("/Hello") {
            call.respondText("Hello สวัสดีครับ")
        }

    }

}