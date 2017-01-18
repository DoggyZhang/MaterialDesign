package com.materialdesign.ui;

import android.os.Bundle;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class PaletteFragment extends BaseFragment {
    @Override
    protected String setTitle() {
        return getResources().getString(R.string.Palette);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_palette;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {

    }
}
