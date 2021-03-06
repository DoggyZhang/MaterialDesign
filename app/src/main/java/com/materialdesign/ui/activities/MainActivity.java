package com.materialdesign.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.materialdesign.R;
import com.materialdesign.ui.fragments.ChooseFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotoChooseFragment();
    }

    private void gotoChooseFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_container, new ChooseFragment())
                .commit();
    }
}
