package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import models.Card;
import models.DeckOfCards;

public class Controller {

    @FXML
    private Label faceNameLabel;

    @FXML
    private Label suitLabel;

    @FXML
    private Label valueLabel;

    private DeckOfCards deck = new DeckOfCards();

    @FXML
    void dealTopCard(ActionEvent event) {
        Card card = deck.dealTopCard();
        faceNameLabel.setText(card.getFaceName());
        suitLabel.setText(card.getSuit());
        valueLabel.setText(Integer.toString(card.getFaceValue()));
    }


}
