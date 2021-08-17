package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;
import java.util.Objects;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void mailUs(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + "akash.a@mca.christuniversity.in"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void callUs(View view) {
        String uri = "tel:" + "8792804302" ;
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    public void findUs(View view) {
        String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=loc:%f,%f", 12.93543765744786, 77.60599838097545);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }

    public void githubPage(View view) {
        String url = "https://github.com/akashroshan135";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}