package com.example.mylearningonline;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView MyString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash);
        setTheme(R.style.AppTheme2);

        MyString= findViewById(R.id.MyString);
        MyString.setText( R.string.name );
        MyString.setAllCaps(true);
        MyString.setTextSize(23);
        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }


}
