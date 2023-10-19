package com.xr.demo.config

import com.baomidou.mybatisplus.annotation.DbType

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@MapperScan(value = ["com.xr.demo.mapper"])
class MybatisPlusConfig {

    @Bean
    fun mybatisPlusInterceptor(): MybatisPlusInterceptor {
        val interceptor = MybatisPlusInterceptor()
        interceptor.addInnerInterceptor(PaginationInnerInterceptor(DbType.MYSQL))
        return interceptor
    }
}