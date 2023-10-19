package com.xr.demo.utils

data class Result<T>(val code: Int,
                     val msg: String,
                     val data: T
)
