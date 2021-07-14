package com.example.homeconnect.data

import androidx.lifecycle.LiveData

class UserRepository (private val UserDao: UserDao) {

    val readAllData: LiveData<List<User>> = UserDao.readAllData()

    suspend fun addUser(user: User) {
        UserDao.addUser(user)
    }
//    fun fetchUser():LiveData<User>{
//        return UserDao.getdata()
//    }
//
//    fun readUser(): LiveData<User> {
//        return UserDao.readUser()
//    }
}