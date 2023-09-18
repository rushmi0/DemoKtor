package org.camrent.database.repository

import org.camrent.database.forms.CustomersForm
import org.camrent.utils.BaseResponse

class CustomersRepositoryImpl : CustomersRepository {

    override suspend fun signUpCustomer(form: CustomersForm): BaseResponse<Any> {
        TODO("Not yet implemented")
    }

    override suspend fun signInCustomer(userName: String, pass: String): BaseResponse<Any> {
        TODO("Not yet implemented")
    }

}