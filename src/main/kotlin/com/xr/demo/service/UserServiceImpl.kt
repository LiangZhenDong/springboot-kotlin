package com.xr.demo.service

import com.xr.demo.entity.User
import com.xr.demo.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserServiceImpl : UserService {

    @Autowired
    var userMapper: UserMapper? = null

    override fun loginService(uname: String, password: String): String {
        val user = userMapper?.selectByUname(uname)
        if (user != null) {
            if (user.password == password) {
                return "OK"
            } else {
                return "ERROR"
            }
        }
        return "用户不存在"
    }

    override fun registerService(user: User): String {
        val userR = userMapper?.selectByUname(user.uname)
        if (userR == null) {
            userMapper?.insert(user)
            return "注册成功"
        }
        return "用户已存在"
    }
}