package com.example.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set up a TextView to display "Hello, World!"
        TextView textView = new TextView(this);
        textView.setText("Hello, World!");
        textView.setTextSize(24);
        textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        // Set the TextView as the content view
        setContentView(textView);

        setContentView(R.layout.activity_main);
    }
}
