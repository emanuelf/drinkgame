package com.example.hrant.drinkgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.Card;
import com.example.Deck;

public class GameActivity extends AppCompatActivity {
    Deck deck;
    Button getRandomCardButton;
    TextView cardTextView;
    Button replayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        deck = new Deck();

        getRandomCardButton = (Button)findViewById(R.id.get_random_card);
        cardTextView = (TextView)findViewById(R.id.card_text_view);
        replayButton = (Button)findViewById(R.id.replay_button);
        replayButton.setVisibility(View.INVISIBLE);
        getRandomCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!deck.isEmpty()) {
                    Card card = deck.getCard();
                    String cardInfo = card.getSuit().name() + " " + card.getValue().name();
                    cardTextView.setText(cardInfo);
                }
                else {
                    replayButton.setVisibility(View.VISIBLE);
                    getRandomCardButton.setVisibility(View.INVISIBLE);
                    cardTextView.setVisibility(View.INVISIBLE);
                }
            }
        });
        replayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setVisibility(View.INVISIBLE);
                deck = new Deck();
                getRandomCardButton.setVisibility(View.VISIBLE);
                cardTextView.setVisibility(View.VISIBLE);
            }
        });
    }
}
