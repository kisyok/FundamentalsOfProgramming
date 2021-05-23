/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg4;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int year = 2019;
     int J, M, A;
     
     //first day of 2019 is J
     J = 2;
     
     //a leap year is divisible by 4 but not 100
     //a leap year is also divisible by 400
     if ((year%4==0 && year%100!=0) || year%400==0){
     M = (J+2)%7;
     A = (J+3)%7;
     }
     //not a leap year
     else{
         M = (J+1)%7;
         A = (J+2)%7;
     }
     
     //print calendar May
        System.out.println("   Su  M  Tu   W  Th   F  Sa");
        
    //print space
        for (int i=0; i<M; i++){
            System.out.printf("%4s", "");
        }    
    
        //print day May 1-31
        for(int i=1; i<=31; i++){
            System.out.printf("%4d", i);
            M++;
            M=M%7;
            if (M==0){
                System.out.println("");
            }
            
        }
        System.out.println("");
        System.out.println("");
        System.out.println("   Su  M  Tu   W  Th   F  Sa");
        
    //print space
        for (int i=0; i<A; i++){
            System.out.printf("%4s", "");
        }    
        
             for(int i=1; i<=31; i++){
            System.out.printf("%4d", i);
            A++;
            A=A%7;
            if (A==0){
                System.out.println("");
            }
             }
}
}