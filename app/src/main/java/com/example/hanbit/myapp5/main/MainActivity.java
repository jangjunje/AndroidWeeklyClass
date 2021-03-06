package com.example.hanbit.myapp5.main;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hanbit.myapp5.R;
import com.example.hanbit.myapp5.calc.CalcActivity;
import com.example.hanbit.myapp5.kaup.KaupActivity;
import com.example.hanbit.myapp5.login.loginActivity;
import com.example.hanbit.myapp5.signup.SignupActivity;

public class MainActivity extends Activity implements View.OnClickListener {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.btKaup)).setOnClickListener(this);
        ((Button) findViewById(R.id.btCalc)).setOnClickListener(this);
        ((Button) findViewById(R.id.btLogin)).setOnClickListener(this);
        ((Button) findViewById(R.id.btSignup)).setOnClickListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btKaup:
                startActivity(new Intent(this, KaupActivity.class));
                break;
            case R.id.btCalc:
                startActivity(new Intent(this, CalcActivity.class));
                break;
            case R.id.btLogin:
                startActivity(new Intent(this, loginActivity.class));
                break;
            case R.id.btSignup:
                startActivity(new Intent(this, SignupActivity.class));
                break;
        }
    }
}
