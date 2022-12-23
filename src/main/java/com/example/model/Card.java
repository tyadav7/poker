package com.example.model;

public class Card {

    private final RANK rank;
    private final SUIT suit;

    public Card(SUIT suit, RANK value) {
        this.suit = suit;
        this.rank = value;
    }

    public RANK getRank() {
        return this.rank;
    }

    public SUIT getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + this.rank +
                ", suit=" + this.suit +
                '}';
    }
}
