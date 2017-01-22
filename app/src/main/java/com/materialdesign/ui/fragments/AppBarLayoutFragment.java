package com.materialdesign.ui.fragments;

import android.os.Bundle;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class AppBarLayoutFragment extends BaseFragment {
    @Override
    protected String setTitle() {
        return getResources().getString(R.string.AppBarLayout);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_appbarlayout;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {

    }
}
