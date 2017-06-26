package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import deck.CardSuit;

import static org.junit.Assert.assertEquals;
/**
 * Created by user on 23/06/2017.
 */

public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer();
    }

    @Test
    public void makeNewDealers(){
        assertEquals(0, dealer.getDeckSize());
    }

    @Test
    public void populateDeck(){
        dealer.populateDeck();
        assertEquals(52, dealer.getDeckSize());
    }

    @Test
    public void dealCardRemovesFromDeck(){
        dealer.populateDeck();
        Card card = dealer.dealCard();
        assertEquals(51, dealer.getDeckSize());
    }

    @Test
    public void dealCard(){
        dealer.populateDeck();
        Card card = dealer.dealCard();
        assertEquals(CardSuit.HEARTS, card.getCardSuit());
    }
}
