package com.atidvaya.sidd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Intent intent = getIntent();

        String userInfo = intent.getStringExtra("UserID");


        Toast.makeText(HomeScreenActivity.this,"Welcome " + userInfo,Toast.LENGTH_SHORT).show();
    }
}
