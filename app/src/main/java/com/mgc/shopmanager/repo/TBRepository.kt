package com.mgc.shopmanager.repo

import com.mgc.shopmanager.base.BaseRepository
import com.mgc.shopmanager.base.Datas
import com.mgc.shopmanager.utils.LogUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class TBRepository : BaseRepository() {

     suspend fun foreachLHDatas():String = withContext(Dispatchers.IO){
         var body = Jsoup.connect(Datas.aliUrl+"/alizs/market.htm").get().body()
         var firstCateList =  body.getElementById("aliindex-masthead").getElementsByClass("header")[0].getElementsByClass("cate-selectors fd-clr")[0].getElementsByClass("selector cate-select fd-clr")[0].getElementsByTag("a")
         var secondCateList =  body.getElementById("aliindex-masthead").getElementsByClass("header")[0].getElementsByClass("cate-selectors fd-clr")[0].getElementsByClass("selector cate-select fd-clr")[1].getElementsByTag("a")
//             .getElementsByAttribute("data-key").
//         RetrofitManager.reqApi.getAlizs()
         firstCateList.forEach {
             var title = it.attr("title")
             LogUtil.d("firstCateList title:$title")
         }
         secondCateList.forEach {
             var title = it.attr("title")
             LogUtil.d("secondCateList title:$title")
         }
         "123"
     }

}