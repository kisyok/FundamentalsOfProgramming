/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor71.d;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor71D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\COURSES\\FUNDAMENTALS OF PROGRAMMING\\TUTORIAL7\\lab\\Tutor7-1c\\integer.dat"));
            int count=0, sum=0;
            try{
                while(true){
                    int num=in.readInt();
                    count++;
                    sum+=num;
                    System.out.print(num + " ");
                }
            }catch(EOFException e){
            }
            System.out.println("Average : " + sum/(count*1.0));
                in.close();
            }catch(FileNotFoundException e){
                System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
