package com.subbu.jokeandlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textView = (TextView) findViewById(R.id.jokeTextView);
        String joke = getIntent().getExtras().getString(JOKE);
        textView.setText(joke);
    }
}
