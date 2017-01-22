package com.materialdesign.ui.fragments.behaviors;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/13.
 */

public class SimpleBehaviorBehaviorFragment1 extends BaseFragment {

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.SimpleBehavior1);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_behavior_simplebehavior_1;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        View tvDrag = view.findViewById(R.id.tv_fragment_behavior_simplebehavior_1_child);
        View dependencyView = view.findViewById(R.id.btn_fragment_behavior_simplebehavior_1_dependency);
        dependencyView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    v.setX(event.getRawX() - v.getWidth() / 2);
                    v.setY(event.getRawY() - v.getHeight() - getResources().getDimension(android.support.v7.appcompat.R.dimen.abc_action_bar_default_height_material));
                }
                return true;
            }
        });

        SimpleBehaviorBehavior1 behavior = new SimpleBehaviorBehavior1();
        ((CoordinatorLayout.LayoutParams) tvDrag.getLayoutParams()).setBehavior(behavior);
    }


    public class SimpleBehaviorBehavior1 extends CoordinatorLayout.Behavior<TextView> {

        @Override
        public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
            return dependency.getId() == R.id.btn_fragment_behavior_simplebehavior_1_dependency;
        }

        @Override
        public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child, View dependency) {
            child.setText("( Child ) x : " + dependency.getX() + " y : " + dependency.getY());
            child.setX(dependency.getX());
            child.setY(dependency.getY() + dependency.getHeight());
            return true;
        }
    }
}
