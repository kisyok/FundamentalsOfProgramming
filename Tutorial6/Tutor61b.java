/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61b;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor61b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("num = ");
        int num = s.nextInt();
        System.out.println(isSquare(num));
    }
    
    public static boolean isSquare(int x){
        int b = (int) Math.sqrt(x);
        if(b*b==x){
            return true;
        }
        else{
            return false;
        }
    }
//        public static boolean PerfectSquare(int num){
//            boolean check=true;
//                    
//            for (int i=1, n=1; n<=num; i++, n=i*i){
//            if (n==num){
//                check=true;
//            }
//            else{
//            check=false;}
//        }
//            return check;
//        }
        }
