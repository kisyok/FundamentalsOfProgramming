/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

for(int i=0; i<5*2; i+=2){//increment by 2
            multiPrint(5-i/2, ' ');//decrease space by 1
            multiPrint(i+1, '*');//print stars
            System.out.println("");
    }
//        System.out.println("");
//        for(int i=0; i<5*2; i+=2){//increment by 2
//            multiPrint(5-i/2, ' ');//decrease space by 1
//            multiPrint(i+1, '*');//print stars
//            System.out.println("");
//    }
//        for(int i=5*2; i>=0; i-=2){
//            multiPrint(5-i/2, ' ');
//            multiPrint(i+1, '*');
//            System.out.println("");
//    }

    }
    public static void multiPrint(int n, char c){
        for(int i=0; i<n; i++){
            System.out.print(c);
        }
        
    }
}