package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import models.DeckOfCards;

import java.net.URL;
import java.util.ResourceBundle;

public class HandOfCardsController implements Initializable {

    @FXML
    private ImageView card1ImageView;

    @FXML
    private ImageView card2ImageView;

    @FXML
    private ImageView card3ImageView;

    @FXML
    private ImageView card4ImageView;

    @FXML
    private ImageView card5ImageView;

    private DeckOfCards deckOfCards;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();
        dealNewHand();
    }

    @FXML
    private void dealNewHand()
    {
        card1ImageView.setImage(deckOfCards.dealTopCard().getImage());
        card2ImageView.setImage(deckOfCards.dealTopCard().getImage());
        card3ImageView.setImage(deckOfCards.dealTopCard().getImage());
        card4ImageView.setImage(deckOfCards.dealTopCard().getImage());
        card5ImageView.setImage(deckOfCards.dealTopCard().getImage());
    }
}

