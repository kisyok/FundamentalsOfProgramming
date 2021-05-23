/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial2;

import java.util.Scanner;

/**
 *
 * @author course010
 */
public class Tutorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1(a)
        System.out.print("Faculty of Computer Science");
        System.out.println("and Information Technology ");
        
        //1(b)
        System.out.println("Faculty\nof\nComputer\nScience\nand\nInformation\nTechnology");
        /*
        //2
        System.out.print("\SDN\" - Software-defined metworking");
        */
        //3(a)
        System.out.println("Java Programming");
        System.out.println("Introduction to Java! ");
        System.out.println("");
        
        /*
        //4
        String MatricNumber;
        double pi;
        boolean M=false;
        long P=880000000L;
        char letter='U';
        final String PRO="Java";
        */
        
        /*
        //5(a)
        double Amount=32.5;
        AMOUNT+ =10;
        System.out.println("The amount is"+);
        */
        
        //5(b)
        String chapter = "Summary";
        System.out.println(chapter);

        //5(c)
        int num=0;
        
        
        
        //6
        Scanner input=new Scanner(System.in);
     System.out.print("Enter diameter : ");
     double diameter=input.nextDouble();

     double circumference;
     circumference=2*Math.PI*(diameter/2);
     System.out.printf("The circumference of the circle is : %.3f ",circumference );
        
     //7
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter value in inch:");
     double inch=sc.nextDouble();
     
     final double conv = 2.54;
             double meter=inch*conv/100;
             
             System.out.printf("%f inches = %.2f meters\n", inch, meter);
             

        
        
        
       
    }
    
}
