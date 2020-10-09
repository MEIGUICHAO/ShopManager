package com.mgc.shopmanager.adapter;


import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mgc.shopmanager.base.BaseFragment;
import com.mgc.shopmanager.base.BaseVMFragment;

import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {

    private List<BaseVMFragment> fragments;

    public ViewPageAdapter(FragmentManager fm, List<BaseVMFragment> list) {
        super(fm);
        fragments = list;
    }

    @Override
    public BaseVMFragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
