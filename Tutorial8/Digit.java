/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Digit {
    private int number;
          public Digit(int a){
          number = a;
}
             public int digitMultiplication(){
                 int ans=1;
        String b = Integer.toString(number);
        for(int i=0; i<b.length(); i++){
          int c = b.charAt(i)-'0';
          ans = ans*c;
        }
        return ans;
        }
        public String toString(){
        return "Digit Multiplication : " + digitMultiplication();
        }
        }
