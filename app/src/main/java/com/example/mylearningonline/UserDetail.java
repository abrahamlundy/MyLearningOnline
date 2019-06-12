package com.example.mylearningonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent Dashboard = new Intent(getApplicationContext(), com.example.mylearningonline.Dashboard.class);
        startActivity(Dashboard);
        finish();
    }
}
