package com.materialdesign.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/1/12.
 */

public abstract class BaseFragment extends Fragment {

    private int layoutId;
    private String title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle(setTitle());
        layoutId = setLayoutId();
        View inflateView = inflater.inflate(layoutId, null, false);
        return inflateView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        restoreSavedInstanceState(savedInstanceState);
        initView(view);
    }

    /**
     * set current title
     *
     * @return title
     */
    protected abstract String setTitle();

    /**
     * set fragment layoutID
     *
     * @return layoutID
     */
    protected abstract int setLayoutId();

    /**
     * restore fragment state
     *
     * @param savedInstanceState
     */
    protected abstract void restoreSavedInstanceState(Bundle savedInstanceState);

    /**
     * init view that inflated
     *
     * @param view inflated view
     */
    protected abstract void initView(View view);

}
