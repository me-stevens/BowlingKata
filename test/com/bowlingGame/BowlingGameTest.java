/**
 * Created by admin on 9/10/15.
 */

package com.bowlingGame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingGameTest {
    /*
    JUnit 4 cheatsheet:
    @Before
    @After
    @Ignore (before @Test)
    @Test (expected = Exception.class)
    @Test(timeout = 1000) after 1000 it fails
    assertEquals(expected, actual);
    */

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void GutterGame() {

        assertEquals(0, game.score());
    }

    @Test
    public void AllOnes() {
        for(int i=0; i<20; i++)
            game.roll(1);

        assertEquals(20, game.score());
    }
}