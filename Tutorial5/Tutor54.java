/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor5.pkg4;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int counter = 0;
        String a = "the";
       String[] sentence = {"the","too","hi"};
       for(int i=0;i<sentence.length;i++){
      if(a.equals(sentence[i])){
          counter +=1;
      }
    }
        System.out.println("occur: " + counter);
}
}
