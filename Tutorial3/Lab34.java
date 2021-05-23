/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        
        System.out.println("DICE GAME");
        Random r = new Random();
        
       
        System.out.println("Player 1 roll the dice");
        num1 = 1 + r.nextInt(7);
        System.out.println(num1);
        System.out.println("Player 2 roll the dice");
        num2 = 1 + r.nextInt(7);
        System.out.println(num2);
        
        if (num1>num2){
            System.out.println("Player 1 starts first");
            System.out.println("Player 1 roll the dice");
            num3 = 1 + r.nextInt(7);
            System.out.println(num3);
            System.out.println("Player 1 roll the dice again");
            num4 = 1 + r.nextInt(7);
            System.out.println(num4);
            
            System.out.println("Player 2's turn");
            System.out.println("Player 2 roll the dice");
            num5 = 1 + r.nextInt(7);
            System.out.println(num5);
            System.out.println("Player 2 roll the dice again");
            num6 = 1 + r.nextInt(7);
            System.out.println(num6);
            
        if ((num3+num4)>(num5+num6))
            System.out.println("PLAYER 1 WINS");
        else if ((num3+num4)<(num5+num6))
            System.out.println("PLAYER 2 WINS");
        else
            System.out.println("TIE");
        }
        
        else{
            System.out.println("player 2 starts first");
            System.out.println("Player 2 roll the dice");
            num7 = 1 + r.nextInt(7);
            System.out.println(num7);
            System.out.println("Player 2 roll the dice again");
            num8 = 1 + r.nextInt(7);
            System.out.println(num8);
            
            System.out.println("Player 1's turn");
            System.out.println("Player 1 roll the dice");
            num9 = 1 + r.nextInt(7);
            System.out.println(num9);
            System.out.println("Player 1 roll the dice again");
            num10 = 1 + r.nextInt(7);
            System.out.println(num10);
            
        if ((num9+num10)>(num7+num8))
            System.out.println("PLAYER 1 WINS");
        else if ((num9+num10)<(num7+num8))
            System.out.println("PLAYER 2 WINS");
        else
            System.out.println("TIE");
        }
        
        
        
        

        
        
    }
    
}
