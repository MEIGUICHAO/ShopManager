package com.mgc.shopmanager.net

import com.mgc.shopmanager.base.ResponseData
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface RequestService {

    @GET("/sug")
    suspend fun getTBXialaSuggest(@Query("q") shop:String,@Query("code") code:String = "utf-8",@Query("callback") callback:String ="jsonp216",@Query("area") area:String = "c2c"):ResponseData<String>



}