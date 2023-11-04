package com.example.dekut_campus_voting_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        int secondsDelayed = 1;
        new Handler().postDelayed(() -> {
            startActivity(new Intent(LogoActivity.this, RegisterActivity.class));
            finish();
        }, secondsDelayed * 1500);
    }
}