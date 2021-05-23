/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61e;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor61e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LetterDigits("myname");
    }
        public static void LetterDigits(String s){
            char[] ch = s.toCharArray(); 
            int letters=0, digits=0;
            
            for(int i=0; i<s.length(); i++){
                if (Character.isLetter(ch[i])){
                  letters++;
        }
                else if (Character.isDigit(ch[i])){
                   digits++;
        }
    }
            System.out.println(letters);
            System.out.println(digits);
    }
}
