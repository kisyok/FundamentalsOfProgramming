/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg4;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds : ");

		int seconds = sc.nextInt(); 

		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;

		p2 = p2 / 60;

		System.out.print("HH:MM:SS - " +p2 + "hours" + p3 + "minutes" + p1+"seconds");
		System.out.print("\n");
                
    }
    
}
