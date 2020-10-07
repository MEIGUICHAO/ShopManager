// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.galanz.rxretrofit.network

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.mgc.shopmanager.base.Datas
import com.mgc.shopmanager.net.BaseUrlInterceptor
import com.mgc.shopmanager.net.LenientGsonConverterFactory
import com.mgc.shopmanager.utils.LogUtil
import com.mgc.shopmanager.net.RequestService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object RetrofitManager {

    val reqApi by lazy {

        //日志拦截器
        var httpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        //Okhttp对象
        var okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(BaseUrlInterceptor())
            .build()
        var gson = Gson()
        val retrofit =
            Retrofit.Builder().baseUrl(Datas.url)
                .client(okHttpClient)
                .addConverterFactory(LenientGsonConverterFactory.create(gson))
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build()
        return@lazy retrofit.create(RequestService::class.java)
    }


}

