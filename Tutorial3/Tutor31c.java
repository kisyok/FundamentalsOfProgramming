/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor3.pkg1c;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor31c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
 
        System.out.println("Enter a character:");
        char ch = s.next().charAt(0);
        if (Character.isUpperCase(ch))
           System.out.println("The character is a capital letter");
        else   
            System.out.println("The character is not a capital letter");
        
        
        
        
    }
    
}
