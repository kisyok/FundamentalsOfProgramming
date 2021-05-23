/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg5;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int scoreP1 = 0;
        int scoreP2 = 0;
        
        Random dice = new Random();
        
        while(true){
        int rollP1 = dice.nextInt(7);
        scoreP1 += rollP1;
        System.out.println("P1 scored: " + rollP1 + " current score is " + scoreP1);
        if (rollP1==6){
            rollP1 = dice.nextInt(7);
            scoreP1 += rollP1;
        System.out.println("P1 scored: " + rollP1 + " current score is " + scoreP1);
        }
        if (scoreP1>100){
            System.out.println("Player 1 wins!");
            break;
        }
        
        
  
   
     
        int rollP2 = dice.nextInt(7);
        scoreP2 += rollP2;
        System.out.println("P2 scored: " + rollP2 + " current score is " + scoreP2);
        if (scoreP2==6){
            rollP2 = dice.nextInt(7);
        }
        if (scoreP2>100){
            System.out.println("Player 2 wins!");
            break;
        }
        }
    
    
    
    
    
    
    
    }
}
