/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sadiq
 */
public class CardOperations {
    
    
    public List<Card> shuffleCards(){
        List<Card> cardDeck = new ArrayList<Card>(); //an ArrayList
        
        for(int x=0; x<4; x++){          //suits
            for(int y=2; y<15; y++){     // cards
                cardDeck.add(new Card(x,y));
            }
        }
        
        Collections.shuffle(cardDeck, new Random()); //shuffle
        
        return cardDeck;
    }
    public LinkedList<Card> createDeckOne(List<Card> cardDeck){
        // deck 1
        LinkedList<Card> deck1 = new LinkedList<Card>();
        
        deck1.addAll(cardDeck.subList(0, 25));
        return deck1;
    }
    
    public LinkedList<Card> createDeckTwo(List<Card> cardDeck){
        // deck 2
        LinkedList<Card> deck2 = new LinkedList<Card>();
        deck2.addAll(cardDeck.subList(26, cardDeck.size()));
        return deck2;
    }
    public String compareCards(int r1, int r2,String s1, String s2){
        
            System.out.println("Your card is " + s1 );
            System.out.println("Computer's card is " + s2);
            
            
            if((r1 > r2) && (r1!=0 && r2!=0)){
                
                System.out.println("You won the round");
                return "p1";
            }
 
            else if((r1 < r2) && (r1!=0 && r2!=0)){
                
                System.out.println("Computer wins the round");
                return "p2";
            }
            
            else if((r1==r2) && (r1!=0 && r2!=0)){
                System.out.println("War"); 
                return "war";
            }
            else{
                return "failed";
            }
                

    }
}
