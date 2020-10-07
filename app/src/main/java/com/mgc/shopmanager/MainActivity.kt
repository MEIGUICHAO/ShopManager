package com.mgc.shopmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.mgc.shopmanager.base.BaseViewModelActivity
import com.mgc.shopmanager.vm.TestViewModel

class MainActivity : BaseViewModelActivity<TestViewModel>() {


    override fun initDatas() {
        viewModel.getDatas().observe(this, Observer {

        })
    }

    override fun initView() {
    }

    override fun getLayout(): Int = R.layout.activity_main

    override fun providerVMClass(): Class<TestViewModel>? = TestViewModel::class.java
}