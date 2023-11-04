package com.example.dekut_campus_voting_system;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.dekut_campus_voting_system.R;

public class MainActivity extends AppCompatActivity {
    public void submit(View view){
        Log.i("Info", "Button pressed");
        Toast.makeText(this, "Button Pressed!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}