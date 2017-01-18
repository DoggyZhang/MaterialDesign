package com.materialdesign.ui.behaviors;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.ImageView;

import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/13.
 */

public class SimpleBehaviorBehaviorFragment2 extends BaseFragment {

    private View layout;
    private View icon;

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.SimpleBehavior1);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_behavior_simplebehavior_2;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        icon = view.findViewById(R.id.iv_behavior_simplebehavior_2);

        SimpleBehaviorBehavior2 behavior = new SimpleBehaviorBehavior2();
        ((CoordinatorLayout.LayoutParams) icon.getLayoutParams()).setBehavior(behavior);
    }


    public class SimpleBehaviorBehavior2 extends CoordinatorLayout.Behavior<ImageView> {
        private float fromHeight = 0;
        private float toHeight = 0;

        @Override
        public boolean layoutDependsOn(CoordinatorLayout parent, ImageView child, View dependency) {
            return dependency instanceof NestedScrollView;
        }

        @Override
        public boolean onDependentViewChanged(CoordinatorLayout parent, ImageView child, View dependency) {
            if (fromHeight == 0) {
                fromHeight = child.getHeight();
                toHeight = getResources().getDimension(android.support.design.R.dimen.abc_action_bar_default_height_material);
            }

//            int scrollY = ((NestedScrollView) dependency).getScrollY();
//            if (scrollY <= Math.abs(fromHeight - toHeight)) {
//                child.setScaleX(scrollY / fromHeight);
//                child.setScaleY(scrollY / fromHeight);
//            }
            return true;
        }
    }
}
