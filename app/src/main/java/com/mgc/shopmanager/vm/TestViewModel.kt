package com.mgc.shopmanager.vm

import com.mgc.shopmanager.base.BaseViewModel
import kotlinx.coroutines.CoroutineScope

class TestViewModel:BaseViewModel() {

    override fun loadDatas(): suspend CoroutineScope.() -> Unit {
        TODO("Not yet implemented")
    }
}