package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import deck.CardNumber;
import deck.CardSuit;
import static org.junit.Assert.assertEquals;
/**
 * Created by user on 23/06/2017.
 */

public class PlayerTest {
    Player player;

    @Before
    public void before(){
        player = new Player();
    }

    @Test
    public void drawCard(){
        player.drawCard(new Card(CardSuit.SPADES, CardNumber.FIVE));
        assertEquals(1, player.handCount());
    }

    @Test
    public void drawTwoCards(){
        player.drawCard(new Card(CardSuit.SPADES, CardNumber.SEVEN));
        player.drawCard(new Card(CardSuit.HEARTS, CardNumber.SIX));
        assertEquals(2, player.handCount());
    }

    @Test
    public void playerLoses(){
        assertEquals("BUST! Sorry, you have lost!", player.playerLoses());
    }

    @Test
    public void playerWins(){
        assertEquals("Congratulations! You have won!", player.playerWins());
    }

    @Test
    public void houseTwist(){
        assertEquals("Twist, draw another card", player.houseTwistSixteenOrLess());
    }

    @Test
    public void houseStick(){
        assertEquals("Stick", player.houseStickSeventeenOrGreater());
    }

    @Test
    public void compareScore(){
        assertEquals("Congratulations player 2 has won!", player.compareTotalForResult());
    }

}
