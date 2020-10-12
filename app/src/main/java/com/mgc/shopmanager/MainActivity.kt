package com.mgc.shopmanager

import android.graphics.Color
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mgc.shopmanager.adapter.KotlinDataAdapter
import com.mgc.shopmanager.adapter.ViewPageAdapter
import com.mgc.shopmanager.base.BaseVMFragment
import com.mgc.shopmanager.base.BaseViewModelActivity
import com.mgc.shopmanager.fragment.TBFragment
import com.mgc.shopmanager.utils.ResUtil
import com.mgc.shopmanager.vm.TestViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_tv.view.*

class MainActivity : BaseViewModelActivity<TestViewModel>() {

    private val mainList = arrayListOf<String>("淘宝")
    private var arrowShow = false
    private val fragments = arrayListOf<BaseVMFragment<*>>(TBFragment())
    private val vpAdapter by lazy {
        ViewPageAdapter(supportFragmentManager, fragments)
    }
    var curPostion = 0

    override fun initDatas() {
        viewModel.getDatas().observe(this, Observer {

        })
    }

    override fun initView() {
        flVp.adapter = vpAdapter
        flVp.setCurrentItem(curPostion)
        rcvMain.layoutManager = LinearLayoutManager(applicationContext,RecyclerView.VERTICAL,false)
        rcvMain.adapter = createAdapter()

        initActionbar()

//        SPUtils.putValue(Constants.Cookies,Datas.cookie)
//        LogUtil.d("cookie:${SPUtils.getValue(Constants.Cookies)}")
//        webView.loadUrl("https://www.taobao.com/?spm=a21bo.2017.201857.1.5af911d98BHoqC")
    }

    private fun initActionbar() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val indicator = DrawerArrowDrawable(this)
        indicator.setColor(ResUtil.getC(R.color.textColorSecondary))
        supportActionBar?.setHomeAsUpIndicator(indicator)
        drawerLayout.addDrawerListener(object : DrawerLayout.SimpleDrawerListener() {

            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                if (arrowShow && drawerView.id == rlMain.id) {
                    indicator.progress = slideOffset
                } else {
                    indicator.progress = 0.toFloat()
                }
            }
        })

        val drawerbar: ActionBarDrawerToggle =
            object : ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close) {
            }
        drawerLayout.addDrawerListener(drawerbar)
    }



    private fun createAdapter(): KotlinDataAdapter<String> {
        return KotlinDataAdapter.Builder<String>()
            .setData(mainList)
            .setLayoutId(R.layout.item_tv)
            .addBindView { itemView, itemData,pos ->
                itemView.tvInfo.text = itemData
            }
            .onItemClick { _, itemData ->

            }
            .create()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                arrowShow = true
                toggleDrawerLayout(drawerLayout, rlMain, rlMenu)
            }
            R.id.filter -> {
                arrowShow = false
                toggleDrawerLayout(drawerLayout, rlMenu, rlMain)
            }
        }
        return true
    }

    fun toggleDrawerLayout(
        drawerLayout: DrawerLayout,
        openView: View?,
        closeView: View?
    ) {
        if (drawerLayout.isDrawerOpen(closeView!!)) {
            drawerLayout.closeDrawer(closeView)
        }
        if (drawerLayout.isDrawerOpen(openView!!)) {
            drawerLayout.closeDrawer(openView)
        } else {
            drawerLayout.openDrawer(openView)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun getLayout(): Int = R.layout.activity_main

    override fun providerVMClass(): Class<TestViewModel>? = TestViewModel::class.java
}

