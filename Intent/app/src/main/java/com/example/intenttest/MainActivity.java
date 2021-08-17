package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String user;
    String key;
    EditText userView;
    EditText keyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void loginToNewPage(View view) {
        userView = findViewById(R.id.username);
        keyView = findViewById(R.id.password);
        user = userView.getText().toString();
        key = keyView.getText().toString();

        if (user.isEmpty()) {
            Toast.makeText(this, "Please enter a username", Toast.LENGTH_LONG).show();
        } else {
            if (key.equals("password")) {
                Intent intent = new Intent(this, SideActivity.class);
                Toast.makeText(this, "You're in", Toast.LENGTH_LONG).show();
                intent.putExtra("name", user);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Wrong key", Toast.LENGTH_LONG).show();
            }
        }
    }
}