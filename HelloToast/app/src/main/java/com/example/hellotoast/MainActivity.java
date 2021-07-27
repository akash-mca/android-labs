package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private String colors[] = {"#ff00ff", "#33ffff", "#ff9999", "#33ff33", "#fff043", "#66ffff", "#b266ff"};
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        int index;
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
            index = random.nextInt(6 - 0 + 1) + 0;
            mShowCount.setBackgroundColor(Color.parseColor(colors[index]));
    }

    public void showToast(View view) {
        String text = "The current \uD83C\uDF5E count is " + mShowCount.getText();
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);

        View toastView = toast.getView();

        toastView.setBackgroundResource(R.drawable.toast_drawable);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_VERTICAL, 0, 0);

        TextView textView = toastView.findViewById(android.R.id.message);
        textView.setTextSize(24);
        textView.setTextColor(Color.WHITE);

        toast.show();
    }

}