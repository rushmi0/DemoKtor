package org.camrent

import io.ktor.server.application.*
import org.camrent.plugins.*
import org.camrent.test.hello

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {

    configureHTTP()
    configureMonitoring()
    configureAdministration()
    configureSockets()
    configureTemplating()
    configureSerialization()
    configureSecurity()
    configureRouting()
}
