package com.xr.demo.utils

enum class ResultCode(val code: Int, val msg: String) {
    SUCCESS(200, "Success"),

    ERROR(-100, "Error");
}