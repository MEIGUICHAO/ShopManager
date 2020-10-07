package com.mgc.shopmanager.repository

import com.galanz.rxretrofit.network.RetrofitManager
import com.mgc.shopmanager.base.BaseRepository
import com.mgc.shopmanager.base.ResponseData

class TestRepository:BaseRepository() {

    suspend fun getDatas():ResponseData<String> = request {
        RetrofitManager.reqApi.getTBXialaSuggest("模型车")
    }
}