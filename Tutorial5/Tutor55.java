/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg5;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String[] input = {"This is me", "hi helo","see you"};
  for(int i = input.length-1; i>=0; i--){
            for(int j= input[i].length()-1; j>=0; j--){
                System.out.print(input[i].charAt(j) );
               
            }
            
        }
    }
    
}
