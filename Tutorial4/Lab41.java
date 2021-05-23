/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = s.nextInt();
        System.out.print("The factors are: " );
        for (int i=1; i<=num; i++){
            if (i!=num && num%i == 0 ){
            System.out.print( i + ", ");
            }
            else if(i==num && num%i == 0 ){
                System.out.print(i);    
            }
         
        }
            
    }
    }
    
