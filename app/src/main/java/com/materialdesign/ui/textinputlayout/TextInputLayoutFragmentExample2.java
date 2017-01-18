package com.materialdesign.ui.textinputlayout;

import android.os.Bundle;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class TextInputLayoutFragmentExample2 extends BaseFragment {
    @Override
    protected String setTitle() {
        return getResources().getString(R.string.TextInputLayout);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_textinputlayout_example_2;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {

    }
}
