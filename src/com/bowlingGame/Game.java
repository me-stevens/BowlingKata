package com.bowlingGame;

/**
 * Created by admin on 8/10/15.
 */
public class Game {

    private int score       = 0;
    private int[] rolls     = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        score += pins;
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        return score;
    }
}
