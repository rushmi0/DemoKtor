package org.camrent.database.service

import org.camrent.database.models.CustomersField

interface CustomerService {

    suspend fun signupCustomer(form: CustomersForm): CustomersField?
    suspend fun findUserByUserName(userName: String): CustomersField?

}