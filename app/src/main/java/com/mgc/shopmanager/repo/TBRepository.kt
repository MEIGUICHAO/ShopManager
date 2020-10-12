package com.mgc.shopmanager.repo

import com.galanz.rxretrofit.network.RetrofitManager
import com.mgc.shopmanager.base.BaseRepository
import com.mgc.shopmanager.base.Datas
import com.mgc.shopmanager.base.ResponseData
import com.mgc.shopmanager.utils.LogUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class TBRepository : BaseRepository() {

     suspend fun foreachLHDatas():String = withContext(Dispatchers.IO){
         Jsoup.connect(Datas.aliUrl+"/alizs/market.htm").get().body().getElementById("aliindex-masthead").
                getElementsByClass("header")[0].
                getElementsByClass("cate-selectors fd-clr")[0].
//             .getElementsByAttribute("data-key").
         toString()
//         RetrofitManager.reqApi.getAlizs()
     }

}