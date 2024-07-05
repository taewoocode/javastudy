package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        //13 * 4 = 52
        initCard();
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle( cards );
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.add( new Card( i, suit ) );
            }
        }
    }

    public Card drawCard() {
        return cards.removeFirst();
    }
}
