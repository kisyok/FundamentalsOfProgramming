/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg1b;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab31b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("integer:");
        int num = s.nextInt();
        if (num%2 ==0)
            System.out.println("The integer is an even number");
        else
            System.out.println("The number is an odd number");
        
        
    }
    
}
