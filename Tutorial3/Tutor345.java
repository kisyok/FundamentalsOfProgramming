/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor3.pkg4.pkg5;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor345 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //4
//        int num1, num2, num3;
//        num1 = 2;
//        num2 = 3;
//        num3 = 4;
//        
//        if (num1>num2&&num1>num3)
//            System.out.println(num1+" is the biggest number");
//        else if (num2>num1&&num2>num3)
//            System.out.println(num2+" is the biggesr number");
//        else 
//            System.out.println(num3+" is the biggest number");

         //5
         Scanner s = new Scanner(System.in);
         System.out.println("Input year:");
         int num = s.nextInt();
         if (num%4!=0 )
             System.out.println("It is not a leap year");
         else if (num%100==0 && num%400!=0)
             System.out.println("It is not a leap year");
         else if(num%400==0)
             System.out.println("It is a leap year");
             
         
             
    }
    
}
