package org.camrent.authentication

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.camrent.database.forms.CustomersForm
import org.camrent.database.repository.CustomersRepository

fun Route.auth(repository: CustomersRepository) {

    post ("/auth/signUp") {
        val params = call.receive<CustomersForm>()
        val result = repository.signUpCustomer(params)
        call.respond(result.status, result)
    }

}