package models;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private int faceValue;
    private String suit;

    /**
     * This is the constructor.  It does not have a return type,
     * and the name must be exactly the same as the class name (including the upper case letter)
     * You can have overloaded constructors.
     * @param faceName - example ace
     * @param suit - example spades
     * @param faceValue - example 14
     */
    public Card(String faceName, String suit, int faceValue)
    {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(faceValue);
    }

    /**
     * This constructor should be used if you want ace's to be the highest card value
     * @param faceName
     * @param suit
     */
    // This is an inline comment
    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(calculateFaceValue());
    }

    /**
     * This method will use the face name to provide a value for the card
     * @return int representing the card value in the range 1-14.  Ace will be 14
     */
    private int calculateFaceValue()
    {
//        List<String> faceNames = getValidFaceNames();
//        int positionInList = faceNames.indexOf(faceName);
//        return positionInList+2;
        return getValidFaceNames().indexOf(faceName)+2;
    }

    public String getFaceName() {
        return faceName;
    }


    /**
     * This method will validate if the argument is in the list of valid face names
     * and set the instance variable
     * @param faceName
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if (getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " is not a valid face name, use 1 of "+
                    getValidFaceNames());
    }

    public int getFaceValue() {
        return faceValue;
    }

    /**
     * This will return a list of the valid face names
     * @return List holding String objects with the valid face names
     */
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("two","three","four","five","six","seven","eight","nine",
                "ten","jack","queen","king","ace");
    }

    public void setFaceValue(int faceValue) {
        if (faceValue >= 1 && faceValue <= 14)
            this.faceValue = faceValue;
        else
            throw new IllegalArgumentException("face value must be between 1 and 14 inclusive");
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will return an ArrayList of valid suit names
     * @return a list of String objects that reflect valid suit names
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("spades","clubs","hearts","diamonds");
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        if (getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " was entered, valid suits are: "+getValidSuits());
    }

    /**
     * This method will return a String that represents
     * the card with the face name and suit
     */
    public String toString()
    {
        return faceName + " of " + suit;
    }
}
