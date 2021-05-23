/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61f;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor61f {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        GenRandom(10);
    }
        public static void GenRandom(int N){
            int[] num = new int[N];
            Random rand = new Random();
            for (int i=0; i<num.length; i++){
                num[i]=rand.nextInt(101);
                 System.out.println(num[i]);
            }
           
        }
}
