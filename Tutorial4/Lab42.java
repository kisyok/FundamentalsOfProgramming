/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        int input = s.nextInt();
        int sum=0;
        for(int i=1; i<=input; i++){
            sum += i;
            System.out.print(sum + " ");
        }
        
//        Scanner s = new Scanner(System.in);
//        System.out.print("Integer: ");
//        int num = s.nextInt();
//        
//        for (int i=1; i<=num; i++){
//           int sum = 0; 
//            for (int j=1; j<=i; j++){
//             sum += j;   
//            }
//            System.out.print(sum + " ");
//        }
    }
    
}
