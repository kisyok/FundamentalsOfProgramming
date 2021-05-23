/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg6;

import java.util.Scanner;

/**
 *
 *@author Kisyok Indran Veerasamy
 */
public class Lab26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        double gram = s.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double iFahrenheit = s.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double fFahrenheit = s.nextDouble();
        
        double M = gram/1000;
        double initialTemp = (iFahrenheit-32)/1.8;
        double finalTemp = (fFahrenheit-32)/1.8;
        
        double Q = (double)( M*(finalTemp -initialTemp)*4184)/1000000;
        System.out.println("The nenergy needed is " + Q);
    }
    
}
