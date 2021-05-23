/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61h;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor61h {

    /**
     * @param args the command line arguments
     * @return 
     */
     public static int rand (){
            Random r = new Random();
            int[] random = new int[11];
            
            while(true){
               int n = r.nextInt(11);
                System.out.print(n + " ");
                random[n]++;
                if (random[n]==2){
                     System.out.print("\nThe number that is repeated twice is ");
                    return n;
                    
                }
            }
     }
    public static void main(String[] args) {
        System.out.println(rand());
        }
    }
    

