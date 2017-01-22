package com.materialdesign.ui.fragments.textinputlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.materialdesign.Constants;
import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;

import cn.fanrunqi.materiallogin.LoginActivity;

/**
 * Created by Administrator on 2017/1/12.
 */

public class TextInputLayoutFragment extends BaseFragment implements View.OnClickListener {
    @Override
    protected String setTitle() {
        return getResources().getString(R.string.TextInputLayout);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_textinputlayout;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.btn_TextInputLayout_Example_1).setOnClickListener(this);
        view.findViewById(R.id.btn_TextInputLayout_Example_2).setOnClickListener(this);
        view.findViewById(R.id.btn_TextInputLayout_Example_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        Fragment toFragment = null;
        switch (v.getId()) {
            case R.id.btn_TextInputLayout_Example_1:
                toFragment = new TextInputLayoutFragmentExample1();
                break;
            case R.id.btn_TextInputLayout_Example_2:
                toFragment = new TextInputLayoutFragmentExample2();
                break;
            case R.id.btn_TextInputLayout_Example_3:
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
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
