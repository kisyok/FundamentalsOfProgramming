/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //prefered method: 
//      Scanner s = new Scanner(System.in);
//      int[] array = new int[10];
//      for(int i =0 ; i<array.length; i++){
//          System.out.print("Enter number: ");
//          array[i]=s.nextInt();     
//      }
//      reverse(array);
//        }
//    public static void reverse(int array[]){
//        for(int i=array.length-1; i>=0; i--){
//            System.out.print(array[i]);
//        }


        int[] a = {123456789};
        for(int i=0; i<a.length; i++){
            int r = reverse(a[i]);
            System.out.println("Reverse of the number is: " + r);
    }
    }
private static int reverse(int num){
       int rem, res = 0;
       while(num!=0){
           rem = num%10;
           res=(res*10)+rem;
           num=num/10;
        }
       return res;
    }
}
       
   

