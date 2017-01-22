package com.materialdesign.ui.activities.toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.materialdesign.R;

/**
 * Created by Administrator on 2017/1/22.
 */

public class ToolbarActivity extends AppCompatActivity {

    private static final String TAG = "ToolbarActivity";

    private Toolbar mToolbar;
    private boolean isHasNavigationIcon = false;
    private SwitchCompat mSwitchNavigationIcon;

    private boolean isHasAppLogo = false;
    private SwitchCompat mSwitchAppLogo;

    private boolean isHasTitle = false;
    private SwitchCompat mSwitchTitle;
    private View ivToolbarTitleColorRed;
    private View ivToolbarTitleColorGreen;
    private View ivToolbarTitleColorBlue;

    private boolean isHasSubTitle = false;
    private SwitchCompat mSwitchSubTitle;
    private View ivToolbarSubtitleColorRed;
    private View ivToolbarSubtitleColorGreen;
    private View ivToolbarSubtitleColorBlue;

    private boolean isHasMenu = false;
    private SwitchCompat mSwitchMenu;

    private View ivToolbarBackgroundColorRed;
    private View ivToolbarBackgroundColorGreen;
    private View ivToolbarBackgroundColorBlue;


    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, ToolbarActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_toolbar);

        initView();
        initEvent();
    }

    public void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar_activity);
        setSupportActionBar(mToolbar);

        mSwitchNavigationIcon = (SwitchCompat) findViewById(R.id.switch_toolbar_navigation_icon);
        mSwitchAppLogo = (SwitchCompat) findViewById(R.id.switch_toolbar_app_logo);
        mSwitchTitle = (SwitchCompat) findViewById(R.id.switch_toolbar_title);
        mSwitchSubTitle = (SwitchCompat) findViewById(R.id.switch_toolbar_subTitle);
        mSwitchMenu = (SwitchCompat) findViewById(R.id.switch_toolbar_menu);

        ivToolbarTitleColorRed = findViewById(R.id.iv_toolbar_title_color_red);
        ivToolbarTitleColorGreen = findViewById(R.id.iv_toolbar_title_color_green);
        ivToolbarTitleColorBlue = findViewById(R.id.iv_toolbar_title_color_blue);

        ivToolbarSubtitleColorRed = findViewById(R.id.iv_toolbar_subtitle_color_red);
        ivToolbarSubtitleColorGreen = findViewById(R.id.iv_toolbar_subtitle_color_green);
        ivToolbarSubtitleColorBlue = findViewById(R.id.iv_toolbar_subtitle_color_blue);

        ivToolbarBackgroundColorRed = findViewById(R.id.iv_toolbar_background_color_red);
        ivToolbarBackgroundColorGreen = findViewById(R.id.iv_toolbar_background_color_green);
        ivToolbarBackgroundColorBlue = findViewById(R.id.iv_toolbar_background_color_blue);
    }

    public void initEvent() {
        mSwitchNavigationIcon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkToolBarNavigationIcon(isChecked);
            }
        });
        mSwitchAppLogo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkToolBarAppLogo(isChecked);
            }
        });
        mSwitchTitle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkToolBarTitle(isChecked);
            }
        });
        mSwitchSubTitle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkToolBarSubTitle(isChecked);
            }
        });
        mSwitchMenu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkToolBarMenu(isChecked);
            }
        });

        ivToolbarTitleColorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarTitleColor(R.color.Red);
            }
        });
        ivToolbarTitleColorGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarTitleColor(R.color.Green);
            }
        });
        ivToolbarTitleColorBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarTitleColor(R.color.Blue);
            }
        });

        ivToolbarSubtitleColorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarSubtitleColor(R.color.Red);
            }
        });
        ivToolbarSubtitleColorGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarSubtitleColor(R.color.Green);
            }
        });
        ivToolbarSubtitleColorBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarSubtitleColor(R.color.Blue);
            }
        });

        ivToolbarBackgroundColorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarBackgroundColor(R.color.Red);
            }
        });
        ivToolbarBackgroundColorGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarBackgroundColor(R.color.Green);
            }
        });
        ivToolbarBackgroundColorBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToolBarBackgroundColor(R.color.Blue);
            }
        });

    }

    private void checkToolBarNavigationIcon(boolean isChecked) {
        if (isChecked != isHasNavigationIcon) {
            isHasNavigationIcon = isChecked;
            setToolBarNavigationIcon(isHasNavigationIcon);
        }
    }

    private void setToolBarNavigationIcon(boolean isHasNavigationIcon) {
        if (isHasNavigationIcon) {
            mToolbar.setNavigationIcon(R.mipmap.ic_cursor);
            mToolbar.setNavigationContentDescription("ToolBar - Navigation Icon");
        } else {
            mToolbar.setNavigationIcon(R.drawable.empty);
            mToolbar.setNavigationContentDescription("");

        }
    }

    private void checkToolBarAppLogo(boolean isChecked) {
        if (isChecked != isHasAppLogo) {
            isHasAppLogo = isChecked;
            setToolBarAppLogo(isHasAppLogo);
        }
    }

    private void setToolBarAppLogo(boolean isHasAppLogo) {
        if (isHasAppLogo) {
            mToolbar.setLogo(R.mipmap.ic_launcher);
            mToolbar.setLogoDescription("ToolBar - App Logo");
        } else {
            mToolbar.setLogo(R.drawable.empty);
            mToolbar.setLogoDescription("");
        }
    }

    private void checkToolBarTitle(boolean isChecked) {
        if (isChecked != isHasTitle) {
            isHasTitle = isChecked;
            setToolBarTitle(isHasTitle);
        }
    }

    private void setToolBarTitle(boolean isHasTitle) {
        if (isHasTitle) {
            mToolbar.setTitle("Title");
        } else {
            mToolbar.setTitle(null);
        }
    }

    private void checkToolBarSubTitle(boolean isChecked) {
        if (isChecked != isHasSubTitle) {
            isHasSubTitle = isChecked;
            setToolBarSubTitle(isHasSubTitle);
        }
    }

    private void setToolBarSubTitle(boolean isHasSubTitle) {
        if (isHasSubTitle) {
            mToolbar.setSubtitle("Sub Title");
        } else {
            mToolbar.setSubtitle(null);
        }
    }

    private void checkToolBarMenu(boolean isChecked) {
        if (isChecked != isHasMenu) {
            isHasMenu = isChecked;
            setToolBarMenu(isHasMenu);
        }
    }

    private void setToolBarMenu(boolean isHasMenu) {
        if (isHasMenu) {
            int size = mToolbar.getMenu().size();
            if (size == 0) {
                mToolbar.inflateMenu(R.menu.toolbar_menu);
            }
            mToolbar.setOnMenuItemClickListener(mOnMenuItemClickListener);
        } else {
            mToolbar.getMenu().clear();
        }
    }

    private void setToolBarTitleColor(int colorRes) {
        if (isHasTitle) {
            mToolbar.setTitleTextColor(getResources().getColor(colorRes));
        }
    }

    private void setToolBarSubtitleColor(int colorRes) {
        if (isHasSubTitle) {
            mToolbar.setSubtitleTextColor(getResources().getColor(colorRes));
        }
    }

    private void setToolBarBackgroundColor(int colorRes) {
        mToolbar.setBackgroundColor(getResources().getColor(colorRes));
    }

    private Toolbar.OnMenuItemClickListener mOnMenuItemClickListener = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.toolbar_menu_item1:
                    Toast.makeText(ToolbarActivity.this, "Menu Item 1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.toolbar_menu_item2:
                    Toast.makeText(ToolbarActivity.this, "Menu Item 2", Toast.LENGTH_SHORT).show();
                    break;
            }
            return false;
        }
    };

}
