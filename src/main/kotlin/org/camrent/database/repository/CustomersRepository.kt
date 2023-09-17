package org.camrent.database.repository

import org.camrent.database.service.CustomersForm

interface CustomersRepository {

    suspend fun signUpCustomer(form: CustomersForm)
    suspend fun signInCustomer(userName: String, pass: String)

}