package org.camrent.plugins


import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import org.camrent.test.basic.*

fun Application.configureRouting() {
    routing {

        basicBasePath()

        urlParameters()
        
        requestsBody()

        reponseHeaders()

        uploadImage()

        downloadFile()

        openImage()


        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}

