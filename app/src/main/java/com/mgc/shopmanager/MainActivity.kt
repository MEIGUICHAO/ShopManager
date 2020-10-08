package com.mgc.shopmanager

import androidx.lifecycle.Observer
import com.galanz.rxretrofit.network.RetrofitManager
import com.mgc.shopmanager.base.BaseViewModelActivity
import com.mgc.shopmanager.base.Constants
import com.mgc.shopmanager.base.Datas
import com.mgc.shopmanager.bean.ZTCCatalogBodyBean
import com.mgc.shopmanager.utils.LogUtil
import com.mgc.shopmanager.utils.SPUtils
import com.mgc.shopmanager.vm.TestViewModel
import com.mgc.webviewjshelper.helper.WebViewHelper
import kotlinx.android.synthetic.main.activity_main.*
import java.text.MessageFormat

class MainActivity : BaseViewModelActivity<TestViewModel>() {


    override fun initDatas() {
        viewModel.getDatas().observe(this, Observer {

        })
    }

    override fun initView() {
//        SPUtils.putValue(Constants.Cookies,Datas.cookie)
        WebViewHelper.initWb(webView)
//        LogUtil.d("cookie:${SPUtils.getValue(Constants.Cookies)}")
        webView.loadUrl("https://www.taobao.com/?spm=a21bo.2017.201857.1.5af911d98BHoqC")
    }

    override fun getLayout(): Int = R.layout.activity_main

    override fun providerVMClass(): Class<TestViewModel>? = TestViewModel::class.java
}