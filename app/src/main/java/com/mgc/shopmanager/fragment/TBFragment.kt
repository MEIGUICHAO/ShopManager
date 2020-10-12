package com.mgc.shopmanager.fragment

import com.mgc.shopmanager.R
import com.mgc.shopmanager.base.BaseVMFragment
import com.mgc.shopmanager.vm.TBViewModel

class TBFragment:BaseVMFragment<TBViewModel>() {
    

    override fun providerVMClass(): Class<TBViewModel> = TBViewModel::class.java

    override fun initDatas() {

    }

    override fun initView() {

    }

    override fun getLayout(): Int {
        return R.layout.fragment_webview
    }
}