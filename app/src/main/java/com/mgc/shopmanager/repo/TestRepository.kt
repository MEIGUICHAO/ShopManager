package com.mgc.shopmanager.repo

import com.galanz.rxretrofit.network.RetrofitManager
import com.mgc.shopmanager.base.BaseRepository
import com.mgc.shopmanager.base.Constants
import com.mgc.shopmanager.base.ResponseData
import com.mgc.shopmanager.utils.SPUtils

class TestRepository:BaseRepository() {

    suspend fun getDatas():ResponseData<String> = request {
        RetrofitManager.reqApi.getTitleKeyWord("连衣裙女秋季","连衣裙女秋季","连衣裙女秋季")
    }
}