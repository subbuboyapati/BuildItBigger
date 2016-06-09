package com.subbu.joketeller;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;

import com.subbu.joke.JokeTeller;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = (Context) this;
    }

    public void tellJoke(View view) throws ExecutionException, InterruptedException {
        com.subbu.joke.JokeTeller teller = new JokeTeller();
        Intent intent = new Intent(this, com.subbu.jokeandlib.JokeActivity.class);
        intent.putExtra(com.subbu.jokeandlib.JokeActivity.JOKE, teller.getJoke());
        startActivity(intent);
        Pair<Context, String> pair = new Pair<>(context, "sample");

        new EndpointAsyncTask().execute(pair);
    }
}
