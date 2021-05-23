/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1a
        Random r = new Random();
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("integer.txt"));
            int[] integer = new int[10];
            for(int i=0; i<integer.length; i++){
                integer [i] = r.nextInt(1001);
                p.print(integer[i] + " ");
                
            }
            p.close();
            }catch(IOException e){
                System.out.println("Problem with file output");
            }
        }
    }
    

