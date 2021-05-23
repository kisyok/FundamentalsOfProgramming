/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("N: ");
        int N = s.nextInt();
        Random r = new Random();
        int[] scores = new int[N];
        
        for (int i=0; i<N; i++){
            scores[i] = r.nextInt(101);
        }
        System.out.println(Arrays.toString(scores));
        
        int highest = -1;
        int lowest = 999;
        int sum = 0;
        
        for (int i=0; i<N; i++){
            highest = Math.max(scores[i], highest);
            lowest = Math.min(scores[i], lowest);
            sum += scores[i];
         
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowesr score: " + lowest);
        System.out.println("Average: " + (double) sum/N);
        
        //another solution
//        Scanner s = new Scanner(System.in);
//        System.out.print("N: ");
//        int N = s.nextInt();
//        Random r = new Random();
//        
//        int highest = 0;
//        int lowest = 999;
//        int sum=0;
//        int count=0;
//        int[] score = new int[N];
//        for(int i=0; i<N; i++){
//            score[i]=r.nextInt(101);
//            sum += score[i];
//            if(score[i]>highest){
//                highest = score[i];
//            }
//            if(score[i]<lowest){
//                lowest=score[i];
//            }
//            count +=1;
//        }
//        double average = sum/count;
//        System.out.println(Arrays.toString(score));
//        System.out.println("Highest: " + highest);
//        System.out.println("Lowest: " + lowest);
//        System.out.printf("Average: %.2f " ,average);
    }
    
}
