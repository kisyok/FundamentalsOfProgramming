/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg6;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Random r = new Random();
//        boolean test = true;
//        while(true){
//            int num = r.nextInt();
//            if(num>0){
//                System.out.println(num + " " + Integer.toString(num).length());
//                break;
//            }
//        }
        Random r =new Random();
        int num = r.nextInt();
        int flag=0;
        boolean test=true;
        
        while(test){
            num = r.nextInt();
            if(num>=0){
                System.out.println(num);
                flag=1;
                test=false;
            }
        
        }
        System.out.println("The number of digits in " + num + " is " + Integer.toString(num).length());
    }
    
}

//Random r = new Random();
//    int num =0;
//    boolean status = true;
//    while(status){
//         num = r.nextInt();
//         if(num>=0){
//             System.out.println(num);
//             status=false;
//         }
//    }
//        System.out.println(Integer.toString(num).length());
//    }
//}
//
