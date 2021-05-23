/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int min=999, max=0, num, counter=0, numSq=0, sum=0;
     double avg, sd,sd2;
        System.out.print("Enter a score (negative score to quit): ");
        num = s.nextInt();
        while (num>0){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
            counter = counter + 1;
            sum = sum + num;
            numSq = numSq + num *num;
            System.out.print("Enter a score (negative score to quit): ");
            num = s.nextInt();
        }
        //counter = counter - 1;
        avg = sum/counter;
        sd = ((numSq-((sum*sum)/counter))/(counter-1));
        
        sd2 = Math.sqrt(sd);
       // Math.pow(sd, sd)
       
        System.out.println("Minimun Score: " + min);
        System.out.println("Maximun Score: " + max); 
        System.out.printf("Average Score:%.2f" , avg);
        System.out.println(" ");
        System.out.printf("Standard Deviation:%.2f", sd2 );

            }
            }
       
    
    

