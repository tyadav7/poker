package com.example.service;

import com.example.model.Card;
import com.example.model.SUIT;
import com.example.model.RANK;
import org.junit.jupiter.api.Test;

class DeckTest {

    private final Deck deck;

    public DeckTest() {
        this.deck = new Deck();
    }

    @Test
    void shuffle() {
        this.deck.shuffle();
    }

    @Test
    void deal() {
        Card card = this.deck.deal();
        assert card.getSuit().equals(SUIT.SPADES);
        assert card.getRank().equals(RANK.A);
        card = this.deck.deal();
        assert !card.getRank().equals(RANK.A);

    }
}