/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg1;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.a
 int largest =0;
  for(int n=1; (n*n*n)<2000; n++){
      if(n>largest){
          largest=n;
      }
  }
        System.out.println("largest: " + largest);
    
    //1.b
//       for(int n=1; n<=12; n++){
//           System.out.println("The square of " + n +" "+ (n*n));
//       }
        
     //1c
//     Random r = new Random();
//     for ( int i=1; i<=4; i++){
//        for(int j=1; j<=5; j++){
//            System.out.print(" "+ r.nextInt(101));
//        }
//        System.out.println( );
//        }

      //1d
//       Scanner s = new Scanner(System.in);
//        System.out.println("Input: ");
//        int input = s.nextInt();
//        int sum=0;
//        for(int i=1; i<=input; i++){
//            sum+=i;
//        }
//        System.out.println("the sum for " + input + "numbers are " + sum);

      //1e
//      double sum=0;
//      for (int i=1; i<=25; i++){
//          sum+= (i/( (26-i)*1.0) );
//      }
//        System.out.printf("%.2f", sum);
        }
            
}
    
   

