package com.materialdesign.ui.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class SnackBarFragmentExample2 extends BaseFragment implements View.OnClickListener {
    @Override
    protected String setTitle() {
        return getResources().getString(R.string.SnackBar);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_snackbar_example_2;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.floatingActionButton_snackbar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.floatingActionButton_snackbar:
                showSnackBar(v);
                break;
        }
    }

    private void showSnackBar(View view) {
        Snackbar.make(view, "SnackBar", Snackbar.LENGTH_SHORT).show();
    }
}
