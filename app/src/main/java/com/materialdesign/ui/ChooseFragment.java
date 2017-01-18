package com.materialdesign.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.materialdesign.Constants;
import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;
import com.materialdesign.ui.floatingactionbutton.FloatingActionButtonFragment;
import com.materialdesign.ui.snackbar.SnackBarFragment;
import com.materialdesign.ui.textinputlayout.TextInputLayoutFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class ChooseFragment extends BaseFragment implements View.OnClickListener {

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.app_name);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_choose;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.btn_AppBarLayout).setOnClickListener(this);
        view.findViewById(R.id.btn_CollspsingToolbarLayout).setOnClickListener(this);
        view.findViewById(R.id.btn_CoordinatorLayout).setOnClickListener(this);
        view.findViewById(R.id.btn_FloatingActionButton).setOnClickListener(this);
        view.findViewById(R.id.btn_NavigationDrawer).setOnClickListener(this);
        view.findViewById(R.id.btn_Palette).setOnClickListener(this);
        view.findViewById(R.id.btn_RecyclerView_CardView).setOnClickListener(this);
        view.findViewById(R.id.btn_SnackBar).setOnClickListener(this);
        view.findViewById(R.id.btn_TextInputLayout).setOnClickListener(this);
        view.findViewById(R.id.btn_ToolBar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        Fragment toFragment = null;
        switch (v.getId()) {
            case R.id.btn_AppBarLayout:
                toFragment = new AppBarLayoutFragment();
                break;
            case R.id.btn_CollspsingToolbarLayout:
                toFragment = new CollapsingToolbarLayoutFragment();
                break;
            case R.id.btn_CoordinatorLayout:
                toFragment = new CoordinatorLayoutFragment();
                break;
            case R.id.btn_FloatingActionButton:
                toFragment = new FloatingActionButtonFragment();
                break;
            case R.id.btn_NavigationDrawer:
                toFragment = new NavigationViewFragment();
                break;
            case R.id.btn_Palette:
                toFragment = new PaletteFragment();
                break;
            case R.id.btn_RecyclerView_CardView:
                toFragment = new RecyclerViewCardViewFragment();
                break;
            case R.id.btn_SnackBar:
                toFragment = new SnackBarFragment();
                break;
            case R.id.btn_TextInputLayout:
                toFragment = new TextInputLayoutFragment();
                break;
            case R.id.btn_ToolBar:
                toFragment = new ToolBarFragment();
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
