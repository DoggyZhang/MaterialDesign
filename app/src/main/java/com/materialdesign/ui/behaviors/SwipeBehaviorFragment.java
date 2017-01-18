package com.materialdesign.ui.behaviors;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.materialdesign.R;
import com.materialdesign.adapter.SwipeBehaviorRecycleAdapter;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/13.
 */

public class SwipeBehaviorFragment extends BaseFragment {

    private RecyclerView swipeBehaviors;

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.SwipeBehavior);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_behavior_swipe;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        SwipeDismissBehavior swipeDismissBehavior = new SwipeDismissBehavior();
        swipeDismissBehavior.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY);

        View cardView = view.findViewById(R.id.cardView_swipeBehavior);
        ((CoordinatorLayout.LayoutParams) cardView.getLayoutParams()).setBehavior(swipeDismissBehavior);

        //TODO: There are some problem
        swipeBehaviors = (RecyclerView) view.findViewById(R.id.recyclerView_swipeBehaviors);
        swipeBehaviors.setFocusable(false);
        swipeBehaviors.setLayoutManager(new GridLayoutManager(getContext(), 1));
        swipeBehaviors.setAdapter(new SwipeBehaviorRecycleAdapter(getContext(), 20));


    }
}
