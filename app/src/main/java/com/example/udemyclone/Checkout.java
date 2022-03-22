package com.example.udemyclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkoutpage);
    }

    public void btnBatal(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
