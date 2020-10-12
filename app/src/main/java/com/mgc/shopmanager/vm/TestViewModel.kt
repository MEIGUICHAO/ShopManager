package com.mgc.shopmanager.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mgc.shopmanager.base.BaseViewModel
import com.mgc.shopmanager.base.Constants
import com.mgc.shopmanager.repo.TestRepository
import com.mgc.shopmanager.utils.SPUtils

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