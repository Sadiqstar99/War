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
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class War {

    public static void main(String[] args) {
        boolean flag = true;
        String continueInstruction = "";
        Scanner scan = new Scanner(System.in);
        CardOperations cop = new CardOperations();

        List<Card> shuffledCardDeck = cop.shuffleCards();

        LinkedList<Card> p1Deck = cop.createDeckOne(shuffledCardDeck);
        LinkedList<Card> p2Deck = cop.createDeckTwo(shuffledCardDeck);
        System.out.println("enter 'y' to Pick a card or 'n' to give up");
        continueInstruction = scan.nextLine();

        while (continueInstruction.equalsIgnoreCase("y")) {
            Card p1Card = p1Deck.pop();// pop out a card  
            Card p2Card = p2Deck.pop();// pop out a card 
            String warResult = cop.compareCards(p1Card.getCardRank(), p2Card.getCardRank(), p1Card.toString(), p2Card.toString());

            //rank comparation of two cards
            if (warResult.equalsIgnoreCase("p1")) {//if player 1 has higher rank 
                p1Deck.addLast(p1Card);  //p1 wins both cards and adds at last of his deck
                p1Deck.addLast(p2Card);
            } else if (warResult.equalsIgnoreCase("p2")) {//if player 2 has higher rank 
                p2Deck.addLast(p1Card);  //p2 wins both cards and adds at last of his deck 
                p2Deck.addLast(p2Card);
            } else if (warResult.equalsIgnoreCase("war")) { //war happens when ranks of both cards are equal
                System.out.println("War begins");

                //preparing war cards
                List<Card> warC1 = new ArrayList<Card>();
                List<Card> warC2 = new ArrayList<Card>();

                //player who has 4 cards minimum stays in game and continues for war round if not will loose the game
                for (int x = 0; x < 3; x++) {
                    if (p1Deck.size() == 0 || p2Deck.size() == 0) {
                        break;
                    }
                    System.out.println("Checking there are enough cards for war");

                    warC1.add(p1Deck.pop());  //pop out card for war
                    warC2.add(p2Deck.pop()); //pop out card for war
                }

                // comparing war cards of both players
                if (warC1.size() == 3 && warC2.size() == 3) {
                    //display the war cards from each player
                    System.out.println("War card for you " + warC1.get(0).toString());
                    System.out.println("War card for Computer " + warC2.get(0).toString());

                    //Condition for player 1 winning war round
                    if (warC1.get(2).getCardRank() > warC2.get(2).getCardRank()) {
                        p1Deck.addAll(warC1);
                        p1Deck.addAll(warC2);
                        System.out.println("You won the war round");
                    } else {
                        p2Deck.addAll(warC1);
                        p2Deck.addAll(warC2);
                        System.out.println("Computer wins the war round");
                    }
                }

            }
            if (p1Deck.size() == 0) {
                System.out.println("Computer Won the game and You ran out of cards\nGame Over");
                break;
            } else if (p2Deck.size() == 0) {
                System.out.println("You Won the game and Computer ran out of cards\nGame Over");
                break;
            }
            //scan.nextLine();
            System.out.println("enter 'y' to Pick a card or 'n' to give up");
            continueInstruction = scan.nextLine();
        }
        if(continueInstruction.equalsIgnoreCase("y")){
            System.out.println("Well played mate");
        }
        else{
            System.out.println("You gave up..! better luck next time");
        }

    }
}
