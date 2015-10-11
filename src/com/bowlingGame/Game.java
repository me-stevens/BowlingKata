package com.bowlingGame;

/**
 * Created by admin on 8/10/15.
 */
public class Game {

    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
