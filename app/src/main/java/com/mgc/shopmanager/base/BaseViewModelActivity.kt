package com.mgc.shopmanager.base

import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mgc.shopmanager.R
import com.mgc.shopmanager.utils.ResUtil
import kotlinx.coroutines.TimeoutCancellationException


abstract class BaseViewModelActivity<VM:BaseViewModel> : BaseActivity(){

    protected lateinit var viewModel:VM

    abstract fun providerVMClass():Class<VM>?

    override fun onCreate(savedInstanceState: Bundle?) {
        initVM()
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            )
            actionBar?.setBackgroundDrawable(ColorDrawable(ResUtil.getC(R.color.white)))
            actionBar?.setIcon(R.color.textColorPrimary)
            window?.statusBarColor = ResUtil.getC(R.color.white)
        }

        startObserve()
    }

    private fun startObserve() {
        viewModel.run {
            getError().observe(this@BaseViewModelActivity, Observer {
                requestError(it)
            })
            getFinally().observe(this@BaseViewModelActivity, Observer {
                requestFinally()
            })
        }
    }

    open fun requestFinally() {

    }

    open fun requestError(it: Exception) {
        when(it){
            is TimeoutCancellationException->{
                showToast("请求超时")
            }
        }

    }

    private fun initVM() {
        providerVMClass()?.let {
            viewModel = ViewModelProvider(this).get(it)
            lifecycle.addObserver(viewModel)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycle.removeObserver(viewModel)
    }


}