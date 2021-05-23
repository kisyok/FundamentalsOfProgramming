/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg5;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a,b,c,d,e,f;
     
        System.out.print("a: ");
        a=s.nextInt();
        System.out.print("b: ");
        b=s.nextInt();
        System.out.print("c: ");
        c=s.nextInt();
        System.out.print("d: ");
        d=s.nextInt();
        System.out.print("e: ");
        e=s.nextInt();
        System.out.print("f: ");
        f=s.nextInt();
        
        if (((a*d)-(b*c))==0)
            System.out.println("The equation has no solution");
        else{
        int x, y;
        System.out.print("x: " + (((e*d)-(b*f))/((a^d)-(b*c))));
        System.out.println("  y: " + (((a*f)-(e*c))/((a*d)-(b*c))));
        }
       
    }
    
}
