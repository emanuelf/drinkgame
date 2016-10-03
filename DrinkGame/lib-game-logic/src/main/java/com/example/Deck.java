package com.example;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by hrant on 10/3/16.
 */

public class Deck {
    private Stack<Card> deck;

    public Deck() {

        this.deck = new Stack<>();
        makeDeck();
    }

    private void makeDeck() {
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                deck.add(new Card(suit, value));
            }
        }
        Collections.shuffle(deck);
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public Card getCard() {
        return deck.pop();
    }

}
