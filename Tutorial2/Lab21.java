/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in degree Fahrenheit :");
        double Fahrenheit = sc.nextDouble();

        double Celcious = (Fahrenheit - 32) / 1.8;
             
            System.out.printf("%fFahrenheit = %.2f celcious\n", Fahrenheit, Celcious);
            
            

    }

}
