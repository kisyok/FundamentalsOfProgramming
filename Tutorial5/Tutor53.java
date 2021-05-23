/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg3;

import java.util.Arrays;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] marks = new int[5];         
         int i = 0, j = 1;         
         marks[i] = 12;         
         marks[j] = marks[i] + 19;         
         marks[j-1] = marks[j] * marks [j];        
         marks[j*3] = marks[i+1];         
         marks[++j] = marks[i]%5;        
         marks[2*j] = marks[j-1]; 
         
//         for ( i=1; i<marks.length; i++){
//             for ( j=1; j<marks.length; j++){
//                
//             }
//              
         System.out.println(Arrays.toString(marks));
            
    }
}
    

