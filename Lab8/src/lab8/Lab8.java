/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import javax.swing.JOptionPane;

/**
 *
 * @author exchange
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deck deck = new Deck();
        deck.shuffle();
        JOptionPane.showMessageDialog(null, deck.toString());
        deck.sort();
        JOptionPane.showMessageDialog(null, deck.toString());
        
    }
    
}
