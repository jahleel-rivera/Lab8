/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.Color;

/**
 *
 * @author exchange
 */
public class Card implements Comparable<Card>{
    private Color color;
    private String value;
    
    public Card(){
        color = Color.RED;
        value = "";
    }
    public Card(Color color, String value){
        this.color = color;
        this.value = value;
        
    }
    @Override
    public String toString(){
        String hue = "";
        if(color.equals(Color.BLUE)){
            hue = "Blue";
            
        }
        if(color.equals(Color.GREEN)){
            hue = "Green";
        }
        if(color.equals(Color.RED)){
            hue = "Red";
        }
        if(color.equals(Color.YELLOW)){
            hue = "Yellow";
        }
        return hue + "," + getValue();
        
        
    }

    @Override
    public int compareTo(Card o) {
        Card compareCard = (Card) o;
        
        if(compareCard == null){
            return -1;
        }
        if(color.equals(compareCard.color)){
            return Integer.compare(Integer.parseInt(value), Integer.parseInt(compareCard.value));
            
        }
        if(color.equals(Color.BLUE)){
            return -1;
            
        }
        if(color.equals(Color.GREEN)){
            if(compareCard.color.equals(Color.BLUE)){
                return 1;
        }
        return -1;
        
    }
    if(color.equals(Color.RED)){
        if(compareCard.color.equals(Color.YELLOW)){
            return -1;
        }
        return 1;
    }
    return 1;    
        
        
}
    /**
     * @return the color
     */
    
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
   
    
    
    
}
