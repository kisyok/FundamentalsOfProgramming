/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Enter the integers: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        
        System.out.println("Enter the oprator: ");
        char operator = s.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println("answer is " + (num1+num2));
                break;
            case '-':
                System.out.println("answer is " + (num1-num2));
                break;
            case '*':
                System.out.println("answer is " + (num1*num2));
                break;
            case '/':
                System.out.println("answer is " + (num1/num2));
                break;
            case '%':
                System.out.println("answer is " + (num1%num2));
             
            }
    
    }
    }

    
        
    
    

