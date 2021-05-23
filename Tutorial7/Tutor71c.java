/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg1c;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor71c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            int[] num = new int[10];
            for(int i=0; i<num.length; i++){
                num [i]= r.nextInt(1001);
                out.writeInt(r.nextInt(1001));
            }
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
