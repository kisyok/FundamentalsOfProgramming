/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg2;

import java.util.Random;

/**
 *
 * @author wif190017
 */
public class Lab52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[21];
        int n;
        
        for (int i=1; i<=10; ){
            n = r.nextInt(21);
            if (num[n]==0){
                num[n]++;
                System.out.print(n+ " ");
                i++;
            }
        }
        System.out.println( );
            }
            
                
           
       
    }


