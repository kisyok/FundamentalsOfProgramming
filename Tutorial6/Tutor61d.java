/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61d;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor61d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pentagonal number : "+ Pentagonal(35));
    }
        public static boolean Pentagonal(int p){
            int num=1; 
            for (int i=1; num<=p; i++){
             num=i*(3*i-1)/2;   // formula for the pentagonal number
             
             // Checks if the parameter,p is a pentagonal number
            if (num==p){
                return true;
            }
        }
            return false;
        }
}
    

