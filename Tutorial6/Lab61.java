/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab61 {

    /**
     * @param n
     * @return 
     */
    

    

    public static void main(String[] args) {
        triangleNumber(20);
    }
        public static void triangleNumber (int n){
        int sum=0;
        for (int i=1; i<=n; i++){
        sum += i;
            System.out.println(sum + " ");  
        }
        
    
}
}