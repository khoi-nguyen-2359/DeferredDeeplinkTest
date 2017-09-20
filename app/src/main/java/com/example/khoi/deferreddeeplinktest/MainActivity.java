package com.example.khoi.deferreddeeplinktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView.setText(textView.getText() + "\nonCreate data=" + getIntent().getData() + "\nextras="+getIntent().getExtras());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        textView.setText(textView.getText() + "\nonNewIntent data=" + getIntent().getData() + "\nextras="+getIntent().getExtras());
    }
}
