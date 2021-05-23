/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg5;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Game {
    private String player1, player2;

    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void move(){
        Random r= new Random();
        int sum1=0;
        int sum2=0;
       do{
           
           int player1 = 1 + r.nextInt(7);
           System.out.println("Player 1 = " + player1);
           sum1 += player1;
           System.out.println("Total score of Player 1 = " + sum1);
           if(sum1>=100){
               break;
           }
           int player2 = 1 + r.nextInt(7);
           System.out.println("Player 2 = " + player2);
           sum2 += player2;
           System.out.println("Total score of Player 2 = " + sum2);
       } while(sum1<100&&sum2<100);
       if (sum1>=100){
           System.out.println(this.player1 +" wins");
       }
       else{
           System.out.println(this.player2 +" wins");
       }
    }
    
    
}
