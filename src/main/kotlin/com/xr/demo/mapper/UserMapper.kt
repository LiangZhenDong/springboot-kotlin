package com.xr.demo.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.xr.demo.entity.User
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Repository
@Mapper
interface UserMapper : BaseMapper<User> {

    fun selectByUname(uname: String): User

}