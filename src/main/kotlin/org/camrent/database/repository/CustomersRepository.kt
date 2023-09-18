package org.camrent.database.repository

import org.camrent.database.forms.CustomersForm
import org.camrent.utils.BaseResponse

interface CustomersRepository {

    suspend fun signUpCustomer(form: CustomersForm): BaseResponse<Any>
    suspend fun signInCustomer(userName: String, pass: String): BaseResponse<Any>

}