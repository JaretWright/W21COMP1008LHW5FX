package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    /**
     * This constructor will create will create a default
     * deck of cards that has 52 cards
     */
    public DeckOfCards()
    {
        deck = new ArrayList<>();

        //we need to create Card objects using all the suits
        //and all the face names
        //loop over all the suits
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (int i=0; i<suits.size(); i++)
        {
            //   datatype in each   variable  : this is the list to go over
            //   position of list   name
            for (String             faceName  : faceNames)
            {
                Card newCard = new Card(faceName, suits.get(i));
                deck.add(newCard);
            }
        }
    }

    /**
     * This method will return the "top" card from the deck.  If there are
     * no cards in the deck, it will return null
     */
    public Card dealTopCard()
    {
        if (deck.size()==0)
            return null;
        else
            return deck.remove(0);
    }

    /**
     * This method will shuffle the Card objects into a random order
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}