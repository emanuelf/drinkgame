package com.example;

/**
 * Created by hrant on 10/3/16.
 */

public class Card {
    private Value value;
    private Suit suit;

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
}
