package com.example.intenttest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SideActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side);
        Objects.requireNonNull(getSupportActionBar()).hide();
        TextView username = findViewById(R.id.username);
        Intent intent = getIntent();
        username.setText("Welcome, " + intent.getStringExtra("name"));
    }

    public void ratingSubmit(View view) {
        RatingBar bar = findViewById(R.id.rating);

        if(bar.getRating() > 2){
            Toast.makeText(this, "Oh my god, Thank You", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Bruh!", Toast.LENGTH_LONG).show();
        }
    }

    public void contactUsPage(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}