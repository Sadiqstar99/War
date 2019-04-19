/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

/**
 *
 * @author sadiq
 */
public class Card {

    private int rank;
    private int suit;

    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getCardRank() {
        return rank;
    }

    public void setCardRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        String strCard = "";
        switch (rank) {
            case 11:
                strCard += "Jack";
                break;
            case 12:
                strCard += "Queen";
                break;
            case 13:
                strCard += "King";
                break;
            case 14:
                strCard += "Ace";
                break;
            default:
                strCard += rank;
                break;
        }

        strCard += " of ";

        switch (suit) {
            case 0:
                strCard += "Spades";
                break;
            case 1:
                strCard += "Hearts";
                break;
            case 2:
                strCard += "Clubs";
                break;
            case 3:
                strCard += "Diamonds";
                break;
        }
        return strCard;
    }

}
