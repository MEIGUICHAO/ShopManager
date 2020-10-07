package com.mgc.shopmanager.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.galanz.rxretrofit.network.RetrofitManager
import com.mgc.shopmanager.base.BaseViewModel
import com.mgc.shopmanager.repository.TestRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class TestViewModel:BaseViewModel() {
    val repository = TestRepository()
    val datas:MutableLiveData<String> by lazy { MutableLiveData<String>().also { loadDatas() } }

    fun getDatas():LiveData<String> {
        return datas
    }

    private fun loadDatas() = launchUI {
        val result = repository.getDatas()
        datas.value = result.data
    }


}