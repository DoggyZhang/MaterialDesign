package com.materialdesign.ui.fragments;

import android.os.Bundle;
import android.view.View;

import com.materialdesign.ui.fragments.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/22.
 */

public class SynthesizeFragment extends BaseFragment {
    private String mTitle = "Synthesize";

    @Override
    protected String setTitle() {
        return mTitle;
    }

    @Override
    protected int setLayoutId() {
        return 0;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {

    }
}
