package com.example.udemyclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class coursepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coursepage);
    }

    public void btnBeli(View view) {
        Intent intent = new Intent(this, Checkout.class);
        startActivity(intent);
    }
}
