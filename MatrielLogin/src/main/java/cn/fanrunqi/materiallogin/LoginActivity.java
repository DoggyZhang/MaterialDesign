package cn.fanrunqi.materiallogin;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.transition.Explode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername;
    EditText etPassword;
    Button btGo;
    CardView cv;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        cv = (CardView) findViewById(R.id.cv_login);
        etUsername = (EditText) findViewById(R.id.et_login_username);
        etPassword = (EditText) findViewById(R.id.et_login_password);
        btGo = (Button) findViewById(R.id.bt_login_go);
        btGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
        fab = (FloatingActionButton) findViewById(R.id.fab_login);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void register() {
        getWindow().setExitTransition(null);
        getWindow().setEnterTransition(null);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options =
                    ActivityOptions.makeSceneTransitionAnimation(this, fab, fab.getTransitionName());
            startActivity(new Intent(this, RegisterActivity.class), options.toBundle());
        } else {
            startActivity(new Intent(this, RegisterActivity.class));
        }
    }

    private void login() {
        Explode explode = new Explode();
        explode.setDuration(500);

        getWindow().setExitTransition(explode);
        getWindow().setEnterTransition(explode);
        ActivityOptionsCompat oc2 = ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        Intent i2 = new Intent(this, LoginSuccessActivity.class);
        startActivity(i2, oc2.toBundle());
    }
}
