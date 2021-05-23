/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
        Integer[] array = new Integer[20];
        for(int i=0;i<array.length; i++){
            array[i] = r.nextInt(101);
        }
        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.println(Arrays.toString(array));
        
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array in descending order");
        System.out.println(Arrays.toString(array));
        
        Scanner s = new Scanner(System.in);
        int input;
        System.out.print("Enter a number to search: ");
        input = s.nextInt();
       
        
        for ( int j = 0; j< array.length; j++ ){
	if ( array[j] == input ){
     	  System.out.println(input + " found");
          System.out.println("Linear search - " + j + " loops(s)");
          System.out.println(input + " found");
        }
        
        }
        
        
        int middle;
        int low=0;
        int high=array.length-1;
        //linear search;1024 steps
        //binary search;10 steps log(base2)n:1024->512->256->128->64->32->16->8->4->2->1
        
        while(low<=high){   //as long as not converge
            middle = (low+high)/2;
            if(array[middle]==input){
                System.out.println("Binary search - " + middle + " loops(s)");
                break;
            }
            else if(input<array[middle]){
            high=middle-1;
            }
            else{
                low=middle+1;
            }
                
        }
    }
    }

