package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import models.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;

public class CardViewController implements Initializable {
    @FXML
    private Label faceNameLabel;

    @FXML
    private Label suitLabel;

    @FXML
    private Label errorMsgLabel;

    @FXML
    private ImageView imageView;

    private DeckOfCards deckOfCards;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errorMsgLabel.setVisible(false);
        deckOfCards = new DeckOfCards();
        showNextCard();
    }

    @FXML
    private void showNextCard()
    {
        Card card = deckOfCards.dealTopCard();
        if (card != null) {
            faceNameLabel.setText(card.getFaceName());
            suitLabel.setText(card.getSuit());
            imageView.setImage(card.getImage());
        }
        else
        {
            errorMsgLabel.setVisible(true);
            errorMsgLabel.setText("No cards left");
        }
    }
}
