package com.materialdesign.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class CollapsingToolbarLayoutFragment extends BaseFragment {

    private View toolbarHeader;
    private AppBarLayout appBarLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Toolbar toolbar;

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.CollapsingToolBarLayout);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_collapsingtoolbarlayout;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        toolbarHeader = view.findViewById(R.id.layout_toolbarHeader);

        collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_fragment);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(Color.RED);
        collapsingToolbarLayout.setStatusBarScrimColor(Color.GREEN);

        toolbar = (Toolbar) view.findViewById(R.id.toolbar_collapsing_fragment);

        appBarLayout = (AppBarLayout) view.findViewById(R.id.appbarlayout_collapsing_fragment);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                float headerlayoutPercent = (1 - (toolbar.getHeight() * 1.0f / collapsingToolbarLayout.getHeight() * 1.0f)) / 2;
                float offsetPercent = Math.abs(verticalOffset * 1.0f) / collapsingToolbarLayout.getHeight() * 1.0f;
                if (offsetPercent >= headerlayoutPercent) {
                    collapsingToolbarLayout.setTitle("DoggyZhang");
                } else {
                    collapsingToolbarLayout.setTitle("");
                }
            }
        });
    }
}
