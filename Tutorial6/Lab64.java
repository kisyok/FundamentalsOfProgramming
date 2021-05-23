/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg4;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(gcd(200,625));
    }
    public static int gcd(int a, int b){
        //Euclidean algorith
        //eg. GCD for 1071 and 462
        //1071 % 462 = 147
        //462 % 147 = 21
        //147 % 21 = 0
        //21 % 0 =....
        //always ensure that a>=b
        int tmp = a;
        a = Math.max(a,b);
        b = Math.min(tmp,b);
    
        //write GCD
        int remainder;
    do{
        remainder = a%b;
        a = b;
        b = remainder;
    } while(remainder !=0);
    
    return a;
    }        
    }
    

