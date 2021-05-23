/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61g;

/**
 *
 * @author Kisyok Indran Veerasamy
 */

public class Tutor61g {

    /**
     * @param args the command line arguments
     */
         public static double [] areaandcircumference (double rad){
            double[] ans = new double [2];
            ans[0] = Math.PI*rad*rad;
            ans[1] = 2*Math.PI*rad;
            return ans;
        }
    public static void main(String[] args) {
         double [] b = areaandcircumference(3.41);
        System.out.printf("area: %.2f" ,b[0]);
        System.out.println("");
        System.out.printf("circumference: %.2f" ,b[1]);
    }
    
}
