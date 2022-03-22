package com.example.udemyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }

    public void btnLogin(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void btnSelengkapnya(View view){
        Intent intent = new Intent(this, coursepage.class);
        startActivity(intent);
    }
}