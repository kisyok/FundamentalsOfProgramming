/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2.a
        PrintWriter out= new PrintWriter(new FileOutputStream("d:\\data\\matrix.txt"));
        
        //2b
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        //2c
        int num;
        ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
        num = a.nextInt();
        a.close();
        
        //2d
        ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("data.dat"));
        o.writeChar('A');
        o.close();
    }
}
        }
