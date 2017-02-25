package com.curso.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mainactivity", "estoy en onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mainactivity", "estoy en onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mainactivity", "estoy en onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mainactivity", "estoy en onDrestroy");
    }
}
