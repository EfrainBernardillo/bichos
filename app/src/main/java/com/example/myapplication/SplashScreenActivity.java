package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.Adapters.ProudctAdapter;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent o = new Intent( this,
                ListaProductosActivity.class);
        startActivity(o);
        finish();

        //setContentView(R.layout.activity_splash_screen);
    }
}
