package com.materialdesign.ui.textinputlayout;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.materialdesign.R;
import com.materialdesign.ui.base.BaseFragment;

/**
 * Created by Administrator on 2017/1/12.
 */

public class TextInputLayoutFragmentExample1 extends BaseFragment {

    private TextInputLayout inputLayout_check_error;
    private EditText editText_check_error;

    @Override
    protected String setTitle() {
        return getResources().getString(R.string.TextInputLayout);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_textinputlayout_example_1;
    }

    @Override
    protected void restoreSavedInstanceState(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(View view) {
        inputLayout_check_error = (TextInputLayout) view.findViewById(R.id.textInputlayout_example_1_check_error);
        editText_check_error = (EditText) view.findViewById(R.id.editText_textInputlayout_example_1_check_error);
        editText_check_error.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = s.toString();
                if (text.matches(".*\\d+.*")) {
                    inputLayout_check_error.setErrorEnabled(true);
                    inputLayout_check_error.setError("Do not input nubmer!");
                } else {
                    inputLayout_check_error.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
