package com.mgc.shopmanager.repo

import com.galanz.rxretrofit.network.RetrofitManager
import com.mgc.shopmanager.base.BaseRepository
import com.mgc.shopmanager.base.Constants
import com.mgc.shopmanager.base.Datas
import com.mgc.shopmanager.base.ResponseData
import com.mgc.shopmanager.bean.ZTCCatalogBodyBean
import com.mgc.shopmanager.utils.LogUtil
import com.mgc.shopmanager.utils.SPUtils
import java.text.MessageFormat

class TestRepository:BaseRepository() {

    suspend fun getDatas():ResponseData<String> = request {
        RetrofitManager.urlInterceptor.setCookie(SPUtils.getValue(Constants.Cookies))
//        RetrofitManager.reqApi.getTitleKeyWord("连衣裙女秋季","连衣裙女秋季","连衣裙女秋季")
//        RetrofitManager.reqApi.getZTCRelatedWord(Datas.shopName,"1","50023504")
        RetrofitManager.reqApi.getLoginUserInfo()

    }

}