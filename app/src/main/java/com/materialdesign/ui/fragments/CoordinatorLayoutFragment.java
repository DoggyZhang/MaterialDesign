package com.materialdesign.ui.fragments;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;
import com.materialdesign.ui.fragments.behaviors.SimpleBehaviorBehaviorFragment1;
import com.materialdesign.ui.fragments.behaviors.SimpleBehaviorBehaviorFragment2;
import com.materialdesign.ui.fragments.behaviors.SwipeBehaviorFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class CoordinatorLayoutFragment extends BaseFragment implements View.OnClickListener {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.CoordinatorLayout);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_coordinatorlayout;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.btn_SwipeBehavior).setOnClickListener(this);
        view.findViewById(R.id.btn_simpleBehavior1).setOnClickListener(this);
        view.findViewById(R.id.btn_simpleBehavior2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        Fragment toFragment = null;
        switch (v.getId()) {
            case R.id.btn_SwipeBehavior:
                toFragment = new SwipeBehaviorFragment();
                break;
            case R.id.btn_simpleBehavior1:
                toFragment = new SimpleBehaviorBehaviorFragment1();
                break;
            case R.id.btn_simpleBehavior2:
                toFragment = new SimpleBehaviorBehaviorFragment2();
                break;
        }
        if (toFragment != null) {
            fragmentTransaction
                    .replace(R.id.layout_container, toFragment)
                    .addToBackStack(getResources().getString(R.string.CoordinatorLayout))
                    .commit();
        }
    }
}
