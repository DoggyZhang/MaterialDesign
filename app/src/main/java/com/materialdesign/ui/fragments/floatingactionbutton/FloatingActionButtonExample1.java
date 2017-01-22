package com.materialdesign.ui.fragments.floatingactionbutton;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.AppCompatSeekBar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.materialdesign.R;
import com.materialdesign.ui.fragments.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/16.
 */

public class FloatingActionButtonExample1 extends BaseFragment {
    private static final String TAG = "FloatingActionButton";

    private static final String mTitle = "Example 1";

    private FloatingActionButton actionButton;

    private int mColor = 0x00000000ff000000;
    private int mRed = 0;
    private int mGreen = 0;
    private int mBlue = 0;
    private TextView tv_color;
    private AppCompatSeekBar sb_red;
    private AppCompatSeekBar sb_green;
    private AppCompatSeekBar sb_blue;

    @Override
    protected String setTitle() {
        return mTitle;
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_floatingaction_example1;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        actionButton = (FloatingActionButton) view.findViewById(R.id.floatingActionButton_example_1);

        tv_color = (TextView) view.findViewById(R.id.tv_floatingactionbutton_example_color);
        sb_red = (AppCompatSeekBar) view.findViewById(R.id.seekbar_floatingactionbutton_example_color_red);
        sb_red.setMax(255);
        sb_red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setColorText(progress, mGreen, mBlue);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb_green = (AppCompatSeekBar) view.findViewById(R.id.seekbar_floatingactionbutton_example_color_green);
        sb_green.setMax(255);
        sb_green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setColorText(mRed, progress, mBlue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb_blue = (AppCompatSeekBar) view.findViewById(R.id.seekbar_floatingactionbutton_example_color_blue);
        sb_blue.setMax(255);
        sb_blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                setColorText(mRed, mGreen, progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private int getColor() {
        return mColor;
    }

    private void setColorText(int red, int green, int blue) {
        this.mRed = red;
        this.mGreen = green;
        this.mBlue = blue;
        tv_color.setText("Color RGB: " + this.mRed + "," + this.mGreen + "," + this.mBlue);


        int rgb = Color.rgb(this.mRed, this.mGreen, this.mBlue);
        actionButton.setBackgroundColor(rgb);

    }

}
