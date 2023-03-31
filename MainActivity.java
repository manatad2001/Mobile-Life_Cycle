package com.example.life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "App Created", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "App Started", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "App Resumed", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "App Paused", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "App Stopped", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "App Destroyed", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), "App Restarted", Toast.LENGTH_LONG).show();
    }

}