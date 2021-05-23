/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Random r =new Random();
     int num = r.nextInt(256);
        System.out.println("The random number is: " + num);
  
    int[] binary=new int[8];
    int i=0;
    while (num != 0){
        int digit = num % 2;
        binary[binary.length-1-i]=digit;
        num = num/2;
        i++;
    }
    System.out.println(Arrays.toString(binary).replaceAll("\\,|\\[|\\]",""));
     
  }
 
}
