/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;
import java.awt.Color;
import java.util.Collections;

/**
 *
 * @author exchange
 */
public class Deck {
    private ArrayList<Card> cards;
  

    Deck(){
    cards = new ArrayList();
    
    cards.add(new Card(Color.BLUE, "0"));
    for(int i = 1; i <10; i++){
        cards.add(new Card(Color.BLUE, i+""));
        cards.add(new Card(Color.BLUE, String.valueOf(i)));
    }
    
    cards.add(new Card(Color.GREEN, "0"));
    for(int i = 1; i <10; i++){
        cards.add(new Card(Color.GREEN, i+""));
        cards.add(new Card(Color.GREEN, String.valueOf(i)));
    }
    
    cards.add(new Card(Color.RED, "0"));
    for(int i = 1; i <10; i++){
        cards.add(new Card(Color.RED, i+""));
        cards.add(new Card(Color.RED, String.valueOf(i)));
    }
    
    cards.add(new Card(Color.YELLOW, "0"));
    for(int i = 1; i <10; i++){
        cards.add(new Card(Color.YELLOW, i+""));
        cards.add(new Card(Color.YELLOW, String.valueOf(i)));
    }
}
public void shuffle(){
    for(int i = 0; i < 7; i++){
        Collections.shuffle(cards);
    }
}
public void sort(){
    Collections.sort(cards);
  
}
public String toString(){
    String s ="";
    for(int i = 0; i < cards.size(); i++){
        s += cards.get(i).toString();
        
        if (i % 15 == 0 && i > 0){
            s += System.lineSeparator();
        }else{
            s += "|";
        
        }
    
}
    return s;
}
}