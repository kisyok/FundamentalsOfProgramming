/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg4;

import java.util.Arrays;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] inputMatrix = {
            {1,5,7},
            {3,6,9},
            {5,3,8},
            
        };
        System.out.println("3 by 3 Matrix");
        for(int i=0; i<inputMatrix.length; i++){
        System.out.println(Arrays.toString(inputMatrix[i]));
        }
    int[][] outputMatrix = new int [3][3];
    
    for(int i=0; i<inputMatrix.length; i++){
        for(int j=0; j<outputMatrix.length; j++){
            outputMatrix[j][inputMatrix.length-i-1]=inputMatrix[i][j];
        }
    }
    System.out.println("/nAfter rotate 90 degrees clockwise");
        for(int i=0; i<inputMatrix.length; i++){
            System.out.println(Arrays.toString(outputMatrix[i]));
        }
    }
    
}
