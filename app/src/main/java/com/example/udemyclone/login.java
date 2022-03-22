package com.example.udemyclone;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
    }
    public void btnLoginPage (View view){
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

}
