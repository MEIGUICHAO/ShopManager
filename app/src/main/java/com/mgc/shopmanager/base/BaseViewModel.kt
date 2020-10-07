package com.mgc.shopmanager.base

import androidx.lifecycle.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout
import java.lang.Exception

abstract class BaseViewModel : ViewModel(), LifecycleObserver {

    protected val datas: MutableLiveData<List<BaseBean>> by lazy { MutableLiveData<List<BaseBean>>().also { launchUI(loadDatas()) } }

    abstract fun loadDatas(): suspend CoroutineScope.() -> Unit

    private val error by lazy { MutableLiveData<Exception>() }
    private val finally by lazy { MutableLiveData<Int>() }

    fun launchUI(block: suspend CoroutineScope.() -> Unit) = viewModelScope.launch {
        try {
            withTimeout(5000) {
                block()
            }
        } catch (e: Exception) {
            error.value = e
        } finally {
            finally.value = 200
        }
    }

    fun getError(): LiveData<Exception> {
        return error
    }

    fun getFinally(): LiveData<Int> {
        return finally
    }


}