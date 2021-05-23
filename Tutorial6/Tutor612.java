/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor612;

import java.util.Arrays;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor612 {

    /**
     * @param x
     * @param y
     * @param z
     */
 public static void Q2(int x, int y, int z){
    int[] a = new int[3];
    a[0] = x;
    a[1] = y;
    a[2] = z;
    //got two methods
//    for (int pass=1; pass<=a.length; pass++){
//        for(int i = 0; i<a.length-1; i++){
//            if (a[i] <a[i+1]){
//                int temp = a[i];
//                a[i] = a[i+1];
//                a[i+1] = temp;
//                
//            }
//        }
//    }
//    for (int a1:a){
//        System.out.println(a1 + " ");
//    }
    Arrays.sort(a);
    for(int i=a.length-1; i>=0; i--){
        System.out.print( a[i] + ",");
    }
    }
    
    public static void main(String[] args) {
        Q2(2,3,4);
    }
}



