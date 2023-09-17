package org.camrent.database.service

import org.camrent.database.models.PeopleField

interface PeopleService {

    suspend fun signupPeople(form: PeopleForm): PeopleField?
    suspend fun findUserByUserName(userName: String): PeopleField?

}