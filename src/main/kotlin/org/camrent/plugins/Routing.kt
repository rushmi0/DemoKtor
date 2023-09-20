package org.camrent.plugins


import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import org.camrent.authentication.auth
import org.camrent.database.repository.CustomersRepository
import org.camrent.database.repository.CustomersRepositoryImpl
import org.camrent.database.service.CustomerService
import org.camrent.database.service.CustomerServiceImpl
import org.camrent.test.basic.*


fun Application.configureRouting() {
    routing {
        val service: CustomerService = CustomerServiceImpl()
        val repository: CustomersRepository = CustomersRepositoryImpl(service)
        auth(repository)


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

