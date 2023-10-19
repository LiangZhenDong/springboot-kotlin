package com.xr.demo.controller

import com.xr.demo.entity.User
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam

import com.xr.demo.service.UserServiceImpl
import com.xr.demo.utils.ResultUtils
import com.xr.demo.utils.Result

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody


@RestController
@RequestMapping("/user")
class UserController {
    @Autowired
    var userServiceImpl: UserServiceImpl? = null

    @RequestMapping("/login")
    fun login(@RequestParam uname: String, @RequestParam password: String): Result<Any> {
        val msg = userServiceImpl!!.loginService(uname, password)
        return if ("SUCCESS" == msg) {
            ResultUtils.success("登录成功")
        } else {
            ResultUtils.error(msg)
        }
    }

    @RequestMapping("/register")
    fun login(@RequestBody user: User): Result<Any> {
        val msg = userServiceImpl!!.registerService(user)
        return if ("SUCCESS" == msg) {
            ResultUtils.success("注册成功")
        } else {
            ResultUtils.error(msg)
        }
    }


}