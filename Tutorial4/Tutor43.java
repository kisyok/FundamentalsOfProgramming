/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor4.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1=1, num2=1;
        System.out.println("Fisrt " + 10 + " terms: ");
        for (int i=1; i<=10; ++i){
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
           
        }
        }
            
    }
    

