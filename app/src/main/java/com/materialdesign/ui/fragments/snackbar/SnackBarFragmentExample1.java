package com.materialdesign.ui.fragments.snackbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class SnackBarFragmentExample1 extends BaseFragment implements View.OnClickListener {
    @Override
    protected String setTitle() {
        return getResources().getString(R.string.SnackBar);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_snackbar_example_1;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.btn_SnackBar_Example_1_1).setOnClickListener(this);
        view.findViewById(R.id.btn_SnackBar_Example_1_2).setOnClickListener(this);
        view.findViewById(R.id.btn_SnackBar_Example_1_3).setOnClickListener(this);
        view.findViewById(R.id.btn_SnackBar_Example_1_4).setOnClickListener(this);
        view.findViewById(R.id.btn_SnackBar_Example_1_5).setOnClickListener(this);
        view.findViewById(R.id.btn_SnackBar_Example_1_6).setOnClickListener(this);
        view.findViewById(R.id.btn_SnackBar_Example_1_7).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_SnackBar_Example_1_1:
                showSnackBar1(v);
                break;
            case R.id.btn_SnackBar_Example_1_2:
                showSnackBar2(v);
                break;
            case R.id.btn_SnackBar_Example_1_3:
                showSnackBar3(v);
                break;
            case R.id.btn_SnackBar_Example_1_4:
                showSnackBar4(v);
                break;
            case R.id.btn_SnackBar_Example_1_5:
                showSnackBar5(v);
                break;
            case R.id.btn_SnackBar_Example_1_6:
                showSnackBar6(v);
                break;
            case R.id.btn_SnackBar_Example_1_7:
                showSnackBar7(v);
                break;

        }
    }

    private void showSnackBar1(View view) {
        Snackbar.make(view, "SnackBar 1", Snackbar.LENGTH_SHORT).show();
    }

    private void showSnackBar2(View view) {
        Snackbar.make(view, "SnackBar 1", Snackbar.LENGTH_SHORT)
                .setText("SnackBar Text")
                .show();
    }

    private void showSnackBar3(View view) {
        Snackbar.make(view, "SnackBar 1", Snackbar.LENGTH_SHORT)
                .setActionTextColor(Color.RED)
                .setText("SnackBar Text")
                .show();
    }

    private void showSnackBar4(View view) {
        Snackbar.make(view, "SnackBar 1", Snackbar.LENGTH_SHORT)
                .setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getContext(), "Action", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.RED)
                .setText("SnackBar Text")
                .show();
    }

    private void showSnackBar5(View view) {
        Snackbar.make(view, "SnackBar 1", Snackbar.LENGTH_SHORT)
                .setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getContext(), "Action", Toast.LENGTH_SHORT).show();
                    }
                })
                .setCallback(new Snackbar.Callback() {
                    @Override
                    public void onDismissed(Snackbar snackbar, int event) {
                        switch (event) {
                            case Snackbar.Callback.DISMISS_EVENT_ACTION:
                                Toast.makeText(getContext(), "SnackBar Dismissed : ACTION", Toast.LENGTH_SHORT).show();
                                break;
                            case Snackbar.Callback.DISMISS_EVENT_CONSECUTIVE:
                                Toast.makeText(getContext(), "SnackBar Dismissed : CONSECUTIVE", Toast.LENGTH_SHORT).show();
                                break;
                            case Snackbar.Callback.DISMISS_EVENT_MANUAL:
                                Toast.makeText(getContext(), "SnackBar Dismissed : MANUAL", Toast.LENGTH_SHORT).show();
                                break;
                            case Snackbar.Callback.DISMISS_EVENT_SWIPE:
                                Toast.makeText(getContext(), "SnackBar Dismissed : SWIPE", Toast.LENGTH_SHORT).show();
                                break;
                            case Snackbar.Callback.DISMISS_EVENT_TIMEOUT:
                                Toast.makeText(getContext(), "SnackBar Dismissed : TIMEOUT", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }

                    @Override
                    public void onShown(Snackbar snackbar) {
                        Toast.makeText(getContext(), "SnackBar Shown", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.RED)
                .setText("SnackBar Text")
                .show();
    }

    private void showSnackBar6(View view) {
        Snackbar snackBar = Snackbar.make(view, "SnackBar", Snackbar.LENGTH_SHORT);
        View snackBarView = snackBar.getView();
        snackBarView.setBackgroundColor(Color.BLUE);
        snackBar.show();
    }

    private void showSnackBar7(View view) {
        Snackbar snackBar =
                Snackbar.make(view, "SnackBar", Snackbar.LENGTH_SHORT)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getContext(), "Action", Toast.LENGTH_SHORT).show();
                            }
                        });
        View snackBarView = snackBar.getView();
        snackBarView.setBackgroundColor(Color.BLUE);

        TextView tv_text = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        tv_text.setTextSize(30);
        tv_text.setTextColor(Color.WHITE);

        TextView tv_action = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_action);
        tv_action.setTextColor(Color.YELLOW);

        snackBar.show();
    }
}
