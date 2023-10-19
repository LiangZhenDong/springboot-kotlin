package com.xr.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync
import springfox.documentation.oas.annotations.EnableOpenApi

@SpringBootApplication
@EnableOpenApi
@EnableAsync
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
