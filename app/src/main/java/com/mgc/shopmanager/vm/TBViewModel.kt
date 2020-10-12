package com.mgc.shopmanager.vm

import com.mgc.shopmanager.base.BaseViewModel
import com.mgc.shopmanager.repo.TBRepository
import com.mgc.shopmanager.utils.LogUtil
import org.jsoup.Jsoup

class TBViewModel : BaseViewModel() {
    private val tbDatas = arrayListOf<String>("下拉框选词","列表关键字","直通车选词")

    private val repo = TBRepository()

    fun foreachLHDatas() {
        launchUI {
            LogUtil.d("----------cateList-------")
            val aliresult = repo.foreachLHDatas()

            LogUtil.d("----------cateList-------")
            val document = Jsoup.parse(aliresult)
            val cateList = document.body().getElementById("aliindex-masthead")
//                .getElementsByClass("header")
//        [0].getElementsByClass("cate-selectors fd-clr")[0].getElementsByClass("selector cate-select fd-clr")
//        [0].getElementsByClass("drop-list fd-hide")[1].getElementsByClass("cate-list fd-clr")
            LogUtil.d("----------cateList-------")
            LogUtil.d("----------cateList:${aliresult.length}")
            LogUtil.d("----------cateList:${aliresult}")
        }
    }


}