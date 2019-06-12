package com.example.mylearningonline;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // kita set default nya Home Fragment
        loadFragment(new Home());

        Toolbar myToolbar = (Toolbar) findViewById(R.id.tl_menu);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("My Learning Online");


        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_menu);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()){
                    case R.id.mn_home:
                        fragment = new Home();
                        break;
                    case R.id.mn_recent:
                        fragment = new NotifMess();
                        break;
                    case R.id.mn_eval:
                        fragment = new EvalDuty();
                        break;
                    case R.id.mn_task:
                        fragment = new TaskDuty();
                        break;
                }
                return loadFragment(fragment);
            }
        });
    }

    private boolean loadFragment(Fragment f) {
        if (f != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_container, f)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tool, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.cari:
                Toast.makeText(getApplicationContext(), "Cari", Toast.LENGTH_LONG).show();
                return true;
            case R.id.user:
                Intent user_detail = new Intent(getApplicationContext(), UserDetail.class);
                startActivity(user_detail);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
