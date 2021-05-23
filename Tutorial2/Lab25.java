/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg5;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random r = new Random();
        int num;
        num = 0 + r.nextInt(10001);  
        System.out.println("The random rumber is "+num);
        int a,b,c,d,e;
        
        a=num/10000;
        int t=num%10000;
        b=t/1000;
        t=t%1000;
        c=t/100;
        t=t%100;
        d=t/10;
        e=t%10;
        
        int sum=a+b+c+d+e;
                System.out.println("The sum of the digits are "+sum);
                
                
               
                
    }
    
}
