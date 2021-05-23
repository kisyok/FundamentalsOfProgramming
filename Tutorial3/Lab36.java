/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.pkg6;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        int r;
        System.out.println("Enter the radius: ");
        r = s.nextInt();
        
        int x,y ;
        System.out.println("Enter coordinate x : ");
        x = s.nextInt();
        System.out.println("Enter coordinate y : ");
        y = s.nextInt();
        System.out.println("Coordinate: (" + x + "," + y + ")");
        
        if (x>r || y>r)
            System.out.println("the point is outside the circle");
        else if (x<r || y<r)
            System.out.println("the point is inside the circle");
        else
            System.out.println("the point is on the circle");
    }
    
}
