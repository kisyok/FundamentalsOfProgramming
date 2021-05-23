/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61a;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor61a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getMax(9,2,3));
    }
        public static int getMax (int x, int y, int z){
    
    if (x>=y && x>=z){
        return x;
}
    else if (y>=x && y>=z){
        return y;
}
    else{
    return z;
}    
  }
}
    

