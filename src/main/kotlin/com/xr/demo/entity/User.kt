package com.xr.demo.entity

import javax.persistence.*;

@Table(name = "user")
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val uid: Int,
                val uname: String,
                val password: String)
