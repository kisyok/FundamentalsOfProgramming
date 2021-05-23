/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the car :");
        double P = sc.nextDouble();
        System.out.println("Enter the down payment:");
        double D = sc.nextDouble();
        System.out.println("Enter the interest rate im% :");
        double R = sc.nextDouble();
        System.out.println("Enter the loan duration year :");
        double Y = sc.nextDouble();
        double M = (P - D) * (1 + R*Y/100) / (Y *12) ;     
        System.out.printf("Monthly payment : %.2f",M );
        
            
            
    }
    
}
