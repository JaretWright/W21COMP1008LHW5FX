package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import models.Card;
import models.DeckOfCards;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label faceNameLabel;

    @FXML
    private Label suitLabel;

    @FXML
    private Label valueLabel;

    private DeckOfCards deck;

    @FXML
    void dealTopCard() {
        Card card = deck.dealTopCard();
        faceNameLabel.setText(card.getFaceName());
        suitLabel.setText(card.getSuit());
        valueLabel.setText(Integer.toString(card.getFaceValue()));
    }

    /**
     * This method will be automatically called when the Scene is loaded
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
        deck.shuffle();
        dealTopCard();
    }
}
