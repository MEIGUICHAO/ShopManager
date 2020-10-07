package com.mgc.shopmanager.base

data class ResponseData<out T>(val errorCode: Int, val errorMsg: String, val data: T)