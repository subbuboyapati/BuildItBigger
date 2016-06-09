package com.subbu.gce;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeBean {

    private com.subbu.joke.JokeTeller joke;

    public JokeBean() {
        joke = new com.subbu.joke.JokeTeller();
    }

    public String getJoke() {
        return joke.getJoke();
    }
}