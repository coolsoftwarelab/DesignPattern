package com.csl.mvp.model;

public class Counter {
    private int score;

    public String increaseScore() {
        score++;
        return String.valueOf(score);
    }

    public void restart() {
        clearScore();
    }

    private void clearScore() {
        score = 0;
    }
}
