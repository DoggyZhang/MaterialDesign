package com.materialdesign.ui.floatingactionbutton;

import android.os.Bundle;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/16.
 */

public class FloatingActionButtonExample2 extends BaseFragment {
    private static final String TAG = "FloatingActionButton";

    private static final String mTitle = "Example 2";

    @Override
    protected String setTitle() {
        return mTitle;
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_floatingaction_example2;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
    }
}
