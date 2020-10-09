package com.mgc.shopmanager.base

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.TimeoutCancellationException
import java.lang.Exception

abstract class BaseVMFragment<VM:BaseViewModel>:BaseFragment() {

    protected lateinit var viewModel:VM

    abstract fun providerVMClass():Class<VM>?

    override fun onCreate(savedInstanceState: Bundle?) {
        initVM()
        super.onCreate(savedInstanceState)
        startObserve()
    }

    private fun startObserve() {
        viewModel.run {
            getError().observe(this@BaseVMFragment, Observer {
                requestError(it)
            })
            getFinally().observe(this@BaseVMFragment, Observer {
                requestFinally()
            })
        }
    }

    open fun requestFinally() {

    }

    open fun requestError(it: Exception) {
        when(it){
            is TimeoutCancellationException ->{
                if (activity is BaseViewModelActivity<*>) {
                    (activity as BaseViewModelActivity<*>).showToast("请求超时")
                }
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