package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
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

    @FXML
    private void changeToCardView(ActionEvent event)throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("../views/cardView.fxml"));
        Scene scene = new Scene(root);

        //use the actionevent to get the Stage object
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setTitle("Single Card View");
        stage.setScene(scene);
        stage.show();
    }
}

