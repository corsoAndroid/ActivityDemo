package com.example.sdoro.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ActivityDemo", "Richiamato onCreate() con bundle " + savedInstanceState);
        //setContentView(R.layout.activity_main);
    }
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityDemo", "Richiamato onRestart()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityDemo", "Richiamato onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityDemo", "Richiamato onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityDemo", "Richiamato onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityDemo", "Richiamato onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityDemo", "Richiamato onDestroy()");
    }
}
