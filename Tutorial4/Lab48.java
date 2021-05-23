/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg8;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to find n(random number) prime number
        Random r = new Random();
        int num =0 + r.nextInt(101);
       
        System.out.print("The prime numbers of " + num + " are \n");
        int a=1, b=2;
        while (a<=num){
            boolean prime = true;
            for(int z=2; z<b; z++){
                if(b%z==0){
                    prime=false;
                }
            }
            if (prime==true){
                System.out.print(b + " ");
            a++;
        }
        b++;
    }
//        to find prime number up to the random number
//        Random r = new Random();
//        int num = r.nextInt(101);
        
//        System.out.println("Random number: " + num);
//        
//        for(int i=2; i<=num; i++){
//            boolean prime = true;
//            for(int j=2; j<=i/2; j++){
//                if(i%j==0){
//                    prime=false;
//                    break;
//                }
//            }
//            if(prime==true){
//                System.out.print(i + " ");
//            }
//        }
}
}

