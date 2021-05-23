/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter the sales volume: ");
        double num = s.nextDouble();
        
        
         if(num<=100)
             System.out.printf( "commission: %.2f\n" , (num*0.05));
         else if (num>100 && num<=500)
             System.out.printf("commission: %.2f\n", (num*0.075));
         else if (num>500 && num<=1000)
             System.out.printf("commission: %.2f\n", (num*0.10));
         else if (num>1000)
             System.out.printf("commission: %.2f\n", (num*0.125));
         
        
    }
    
}
