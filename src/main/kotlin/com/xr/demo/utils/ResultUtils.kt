package com.xr.demo.utils

object ResultUtils {

    fun success(obj: Any): Result<Any> {
        return Result(
                ResultCode.SUCCESS.code,
                ResultCode.SUCCESS.msg,
                obj
        )
    }

    fun error(obj: Any): Result<Any> {
        return Result(
                ResultCode.ERROR.code,
                ResultCode.ERROR.msg,
                obj
        )
    }


}