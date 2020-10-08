package com.mgc.shopmanager.base;


import android.app.Application;

import com.mgc.shopmanager.utils.SPUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BaseApplicaton extends Application {

    static ExecutorService singlePool;
    private static BaseApplicaton context;

    private static ExecutorService analysePool;

    public static ExecutorService getAnalysePool() {
        if (null == analysePool) {
            analysePool = Executors.newFixedThreadPool(50);
        }
        return analysePool;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
    /**
     * 获取BaseApplicaton对象
     */
    public static BaseApplicaton getContext() {
        return context;
    }

    public static ExecutorService getSinglePool() {
        if (null == singlePool || singlePool.isShutdown() || singlePool.isTerminated()) {
            singlePool = Executors.newSingleThreadExecutor();
        }
        return singlePool;
    }
}
