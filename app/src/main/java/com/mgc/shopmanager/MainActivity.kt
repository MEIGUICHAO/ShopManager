package com.mgc.shopmanager

import androidx.lifecycle.Observer
import com.mgc.shopmanager.adapter.ViewPageAdapter
import com.mgc.shopmanager.base.BaseVMFragment
import com.mgc.shopmanager.base.BaseViewModelActivity
import com.mgc.shopmanager.fragment.TBFragment
import com.mgc.shopmanager.vm.TestViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseViewModelActivity<TestViewModel>() {

    private val mainList = arrayOf("淘宝")
    private val fragments = arrayListOf<BaseVMFragment<*>>(TBFragment())
    private val vpAdapter by lazy {
        ViewPageAdapter(supportFragmentManager,fragments)
    }

    override fun initDatas() {
//        viewModel.getDatas().observe(this, Observer {
//
//        })
    }

    override fun initView() {
        flVp.adapter = vpAdapter
        flVp.setCurrentItem(0)

//        SPUtils.putValue(Constants.Cookies,Datas.cookie)
//        LogUtil.d("cookie:${SPUtils.getValue(Constants.Cookies)}")
//        webView.loadUrl("https://www.taobao.com/?spm=a21bo.2017.201857.1.5af911d98BHoqC")

    }

    override fun getLayout(): Int = R.layout.activity_main

    override fun providerVMClass(): Class<TestViewModel>? = TestViewModel::class.java
}