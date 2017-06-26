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
        player.drawCard(new Card(CardSuit.SPADES, CardNumber.TEN));
        player.drawCard(new Card(CardSuit.HEARTS, CardNumber.TEN));
        player.drawCard(new Card(CardSuit.DIAMONDS, CardNumber.TEN));
        assertEquals("BUST! Sorry, you have lost!", player.playerLoses());
    }

    @Test
    public void playerWins(){
        player.drawCard(new Card(CardSuit.SPADES, CardNumber.TEN));
        player.drawCard(new Card(CardSuit.HEARTS, CardNumber.TEN));
        player.drawCard(new Card(CardSuit.HEARTS, CardNumber.ACE));
        assertEquals("Congratulations! You have won!", player.playerWins());
    }

    @Test
    public void compareScore(){
        assertEquals("Congratulations player 2 has won!", player.compareTotalForResult());
    }

}
