package com.mgc.shopmanager.net

import com.mgc.shopmanager.base.Constants
import com.mgc.shopmanager.base.Datas
import com.mgc.shopmanager.base.ResponseData
import com.mgc.shopmanager.utils.SPUtils
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface RequestService {

    @GET("/sug")
    suspend fun getTBXialaSuggest(@Query("q") shop:String,@Query("code") code:String = "utf-8",@Query("callback") callback:String ="jsonp216",@Query("area") area:String = "c2c"):ResponseData<String>

//    &imgfile=&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&spm=a21bo.2017.201856-taobao-item.1
    @Headers("urlname:${Datas.stb}","cookie:${Datas.cookie}","referer:${Datas.referer}","sec-fetch-dest:script","sec-fetch-mode:no-cors","sec-fetch-site:same-origin","user-agent:${Constants.UserAgentString}")
    @GET("/search")
    suspend fun getTitleKeyWord(@Query("q") shop:String,@Query("wq") wq:String,@Query("suggest_query") suggest_query:String
    ,@Query("data-key") datakey:String ="sale-desc",@Query("ajax") ajax:String = "true"
    ,@Query("_ksTS") _ksTS:String ="${System.currentTimeMillis()}_744",@Query("callback") callback:String = "jsonp745"
//   ,@Query("_ksTS") _ksTS:String ="1602137866634_744",@Query("callback") callback:String = "jsonp745"
    ,@Query("ie") ie:String ="utf8",@Query("initiative_id") initiative_id:String = "staobaoz_20201008",@Query("stats_click") stats_click:String = "search_radio_all%3A1"
    ,@Query("js") js:String ="1",@Query("_input_charset") _input_charset:String = "utf-8",@Query("source") source:String = "suggest"
    ,@Query("imgfile") imgfile:String ="",@Query("commend") commend:String = "all",@Query("ssid") ssid:String = "s5-e",@Query("search_type") search_type:String = "item",@Query("sourceId") sourceId:String = "tb.index",@Query("spm") spm:String = "a21bo.2017.201856-taobao-item.1"
    ):ResponseData<String>





}