package com.example.mylearningonline;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView myString;
    Button vis_pass, vis_uname, submit_login;
    EditText ed_uname, ed_password;
    Context c;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        c = this.getApplicationContext();
        vis_pass=findViewById(R.id.Btn_Vis_Pass);
        submit_login=findViewById(R.id.btn_login);
        ed_uname= findViewById(R.id.edUnameLogIn);
        ed_password= findViewById(R.id.edPwordLogIn);

        submit_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coba_login();
            }
        });
    }


    public void coba_login(){
        submit_login.setEnabled(false);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(c,"Coba Masuk",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), Dashboard.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik

    }
}
