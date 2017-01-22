package com.materialdesign.ui.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.materialdesign.R;
import com.materialdesign.adapter.ViewPagerAdapter;
import com.materialdesign.ui.fragments.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/12.
 */

public class PaletteFragment extends BaseFragment {

    private TabLayout tabPalette;
    private ViewPager vpPalette;

    private static final int PAGE_COUNT = 5;

    private int[] mImages = {
            R.mipmap.material_1,
            R.mipmap.material_2,
            R.mipmap.material_3,
            R.mipmap.material_4,
            R.mipmap.material_5
    };

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
        tabPalette = (TabLayout) view.findViewById(R.id.tab_palette);

        vpPalette = (ViewPager) view.findViewById(R.id.vp_palette);

        List<View> views = new ArrayList<>();
        List<String> titles = new ArrayList<>();

        for (int i = 0; i < PAGE_COUNT; i++) {
            views.add(createImageView(i % mImages.length));
            titles.add("Page " + i);
        }

//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.material_6);
//        Palette.from(bitmap)

        vpPalette.setAdapter(new ViewPagerAdapter(views, titles));
    }

    private View createImageView(int resId) {
        ImageView iv = new ImageView(getContext());
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        iv.setImageResource(resId);
        return iv;
    }

}
