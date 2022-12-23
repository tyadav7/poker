package com.example.service;

import com.example.model.Card;
import com.example.model.SUIT;
import com.example.model.RANK;
import com.example.utils.StdRandom;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Deck {

    private int dealt;
    private Card[] cards;
    private final SUIT[] suits = SUIT.values();
    private final RANK[] values = RANK.values();

    public Deck() {
        this.cards = new Card[52];
        this.dealt = 0;
        for (int i = 0; i < this.cards.length; i++) {
            cards[i] = new Card(suits[i / 13], values[i % 13]);
        }
    }

    public void shuffle() {
        if(dealt >= cards.length)
            throw new UnsupportedOperationException();
        for (int i = dealt; i < cards.length; i++) {
            exch(i, StdRandom.uniformInt(dealt, i + 1));
        }
    }

    private void exch(int a, int b) {
        Card temp = this.cards[b];
        this.cards[b] = this.cards[a];
        this.cards[a] = temp;
    }

    public Card deal() {
        if(dealt >= cards.length)
            throw new UnsupportedOperationException();
        return cards[dealt++];
    }
}

