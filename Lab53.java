/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int numOfDays=7;
        System.out.print("N: ");
        int N = s.nextInt();
        int[][] data = new int[N][numOfDays];
        
        //fill in the data table randomly
        for(int i=0; i<N; i++){
            for(int j=0; j<numOfDays; j++){
                data[i][j]= 1 + r.nextInt(9);
            }
            
        }
     //print out the table
     for(int i=0; i<N; i++){
         System.out.println(Arrays.toString(data[i]));
     }
     
     //sum up and print the total hours
     for(int i=0; i<N; i++){
        int totalHours = 0;
        for(int j=0; j<numOfDays; j++){
            totalHours += data[i][j];
        }
         System.out.println("Total for worker " + i + " : " + totalHours);
     }
    }
    
}
