/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor3.pkg1d;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor31d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String str1 = "Hi";
       String str2 = "Bye";
       
        if((str1.compareTo(str2))<0){
        System.out.println(str1 + " " + str2);
        }
        else if ((str1.compareTo(str2))>0){
        System.out.println(str2 + " " + str1);
                }
        else{
        System.out.println("order not important");
                }
    
        
    }
    
}
