/**
 * Created by admin on 9/10/15.
 */

package com.bowlingGame;

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

    @Test
    public void GutterGame() {
        Game game = new Game();
    }

}