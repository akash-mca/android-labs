package com.example.activitycycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SideActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side);
        Objects.requireNonNull(getSupportActionBar()).hide();
        Log.d("a", "Activity Created");
        Toast.makeText(this, "Created", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("a", "Activity Started");
        Toast.makeText(this, "Started", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("a", "Activity Restarted");
        Toast.makeText(this, "Restarted", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("a", "Activity Resumed");
        Toast.makeText(this, "Resumed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("a", "Activity Paused");
        Toast.makeText(this, "Paused", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("a", "Activity Stopped");
        Toast.makeText(this, "Stopped", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("a", "Activity Destroyed");
        Toast.makeText(this, "Destroyed", Toast.LENGTH_LONG).show();
    }

    public void ratingSubmit(View view) {
        RatingBar bar = findViewById(R.id.rating);

        if(bar.getRating() > 2){
            Toast.makeText(this, "Oh my god, Thank You", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Bruh!", Toast.LENGTH_LONG).show();
        }
    }
}