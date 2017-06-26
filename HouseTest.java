package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import deck.CardNumber;
import deck.CardSuit;

/**
 * Created by user on 25/06/2017.
 */

public class HouseTest {

    House house;

    @Before
    public void before(){
        house = new House();
    }

    @Test
    public void drawCard(){
        house.drawCard(new Card(CardSuit.SPADES, CardNumber.FIVE));
        assertEquals(1, house.handCount());
    }

    @Test
    public void houseTwist(){
        house.drawCard(new Card(CardSuit.HEARTS, CardNumber.EIGHT));
        assertEquals("Twist, draw another card", house.houseTwistSixteenOrLess());
    }

    @Test
    public void houseStick(){
        house.drawCard(new Card(CardSuit.HEARTS, CardNumber.TEN));
        house.drawCard(new Card(CardSuit.SPADES, CardNumber.EIGHT));
        assertEquals("Stick", house.houseStickSeventeenOrGreater());
    }
}
