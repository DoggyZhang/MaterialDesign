package com.materialdesign.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */
public class NavigationViewFragment extends BaseFragment implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.NavigationView);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_navigation_drawer;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        navigationView = (NavigationView) view.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void setHasOptionsMenu(boolean hasMenu) {
        super.setHasOptionsMenu(hasMenu);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        String toast = null;
        switch (item.getItemId()) {
            case R.id.nav_menu_email:
                toast = String.valueOf("Email");
                break;
            case R.id.nav_menu_facebook:
                toast = String.valueOf("FaceBook");
                break;
            case R.id.nav_menu_github:
                toast = String.valueOf("Github");
                break;
            case R.id.nav_menu_linkedin:
                toast = String.valueOf("LinkedIn");
                break;
            case R.id.nav_menu_weibo:
                toast = String.valueOf("WeiBo");
                break;
            case R.id.nav_menu_zhihu:
                toast = String.valueOf("ZhiHu");
                break;
            default:
                toast = String.valueOf("");
                break;
        }
        Toast.makeText(getContext(), toast, Toast.LENGTH_SHORT).show();
        return true;
    }
}
