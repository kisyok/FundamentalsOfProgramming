/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int row = s.nextInt();
        System.out.printf("The pascal triangle with %d rows\n",row);
        
        
        int[] arr = new int[row];
        int[] arrtemp = new int[row];//temporary array
        arr[0] = 1;//to initialize the first element as 1
        
        for(int i=0; i<arr.length; i++){//loop through the size to generate rows
            for(int a=0; a<arr.length; a++){
                arrtemp[a] = arr[a];//we first fill in the values of arr into arrtemp so that the value
                                    //of arr is not overwritten after the calculation as a avlue can be used
                                    // for two calculatioms for two columns
            }
            if(i>0){//to pring the first line as 1 0 0 0, eg. if your input row is four if u dont want to 
                    //check the condition everytime in the loop, you can print the first line straight away
                    //before the for loop and then remove this if(i>0)
                for(int j=1; j<arr.length; j++){
                    arr[j] = arrtemp[j]+arrtemp[j-1];//to sum the two values of the array
                }
            }
            for(int k: arr){
                System.out.printf("%d ", k);
            }
            System.out.println();
        }
        
}
}

