package com.xr.demo.service

import com.xr.demo.entity.User

interface UserService {
    fun loginService(uname: String, password: String): String
    fun registerService(user: User): String
}