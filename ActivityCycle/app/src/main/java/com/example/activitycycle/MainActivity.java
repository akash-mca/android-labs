package com.example.activitycycle;

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
    String pass;
    EditText userView;
    EditText passView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void loginToNewPage(View view) {
        userView = findViewById(R.id.username);
        passView = findViewById(R.id.password);
        user = userView.getText().toString();
        pass = passView.getText().toString();

        if (user.equals("merin") && pass.equals("mariyam")) {
            Log.d("t", "loginToNewPage: Logged in");
            Toast.makeText(this, "Logged in", Toast.LENGTH_LONG).show();
            openNewActivity();
        } else {
            Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_LONG).show();
        }
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, SideActivity.class);
        startActivity(intent);
    }
}