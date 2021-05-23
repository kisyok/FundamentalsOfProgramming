/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg6;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //print paliindromic prime
        System.out.println("\nPALINDROMIC PRIME\n");
        for(int i=0; i<1000; i++){
            if(isPalindromicPrime(i)){
                System.out.println(i);
            }
        }
        //print emirp prime
        System.out.println("\nEMIRP PRIME\n");
        for(int i=0; i<500; i++){
            if(isEmirp(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPalindromicPrime(int num){
        return isPrime(num) && isPalindrome(num);
    }
    
    public static boolean isEmirp(int num){
        return isPrime(num) && isPrime(reverseNumber(num)) && (!isPalindromicPrime(num));
    }
    
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for (int i=2; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(int num){
        int reversedNumber = reverseNumber(num);
        return reversedNumber == num;
    }
    
    public static int reverseNumber(int num){
        String numStr = Integer.toString(num);
        String reversedNumStr = "";
        
        for(int i=numStr.length()-1; i>=0; i--){
            reversedNumStr += numStr.charAt(i);
        }
        return Integer.parseInt(reversedNumStr);
    }  
}
