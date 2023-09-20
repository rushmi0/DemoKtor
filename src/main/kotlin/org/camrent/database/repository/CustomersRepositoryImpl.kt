package org.camrent.database.repository

import org.camrent.database.forms.CustomersForm
import org.camrent.database.service.CustomerService
import org.camrent.utils.BaseResponse

class CustomersRepositoryImpl(
    private val userService: CustomerService
) : CustomersRepository {

    override suspend fun signUpCustomer(form: CustomersForm): BaseResponse<Any> {
        return if (isUserNameExist(form.userName)) {
            BaseResponse.ErrorResponse(message = "User already Sign-up")
        } else {
            val user = userService.signupCustomer(form)
            if (user != null) {
                BaseResponse.SuccessResponse(data = user)
            } else {
                BaseResponse.ErrorResponse()
            }
        }
    }

    override suspend fun signInCustomer(userName: String, pass: String): BaseResponse<Any> {
        TODO("Not yet implemented")
    }

    private suspend fun isUserNameExist(userName: String): Boolean {
        return userService.findUserByUserName(userName) != null
    }

}