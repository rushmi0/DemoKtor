package org.camrent

import io.ktor.server.application.*
import org.camrent.database.menage.Database
import org.camrent.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {

    //configureHTTP()
    //configureMonitoring()
    //configureAdministration()
    //configureTemplating()
    //configureSecurity()

    Database.initialize()
    configureRouting()
    //configureSockets()
    //configureSerialization()
}
