package com.materialdesign.ui.fragments.floatingactionbutton;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.materialdesign.Constants;
import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class FloatingActionButtonFragment extends BaseFragment implements View.OnClickListener {
    @Override
    protected String setTitle() {
        return getResources().getString(R.string.FloatingActionButton);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_floatactionbutton;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.btn_FloatingActoin_Example_1).setOnClickListener(this);
        view.findViewById(R.id.btn_FloatingActoin_Example_2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        Fragment toFragment = null;
        switch (v.getId()) {
            case R.id.btn_FloatingActoin_Example_1:
                toFragment = new FloatingActionButtonExample1();
                break;

            case R.id.btn_FloatingActoin_Example_2:
                toFragment = new FloatingActionButtonExample2();
                break;
        }
        if (toFragment != null) {
            fragmentTransaction
                    .replace(R.id.layout_container, toFragment)
                    .addToBackStack(Constants.FRAGMENT_CHOOSE)
                    .commit();
        }
    }
}
