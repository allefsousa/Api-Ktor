package com.developer.allef.model

import kotlinx.serialization.Serializable

@Serializable
data class UserInfo(val user: String, val password: String)