/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];
        
        //do a while true loop
        int i = 0;
        while(true){
            if(i>=10){
                break;
            }
            
            //generate a random number
            int randNum = r.nextInt(21);
            
            //check if the random number is already in array
            boolean isInArray = false;
            for(int j=0; j<i; j++){
                if(randNum==array[j]){
                    isInArray=true;
                    break;
                }
            }
            //decide what to do
            if(isInArray==true){
                continue;
            }
            else{
                array[i]=randNum;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}
