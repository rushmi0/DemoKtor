package org.camrent.database.service

import org.camrent.database.forms.CustomersForm
import org.camrent.database.field.CustomersField

interface CustomerService {

    suspend fun signupCustomer(form: CustomersForm): CustomersField?
    suspend fun findUserByUserName(userName: String): CustomersField?

}