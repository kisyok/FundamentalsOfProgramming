/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"));
            
            int numOfRecords = in.readInt();
            
            
            String gender1 = "";
            for(int i=0; i<numOfRecords; i++){
                String name = in.readUTF();
                int age = in.readInt();
                char gender = in.readChar();
                if(gender == 'M'){
                   gender1 = "Male";
                }
                if(gender == 'F'){
                   gender1 = "Female";
                }
                
                System.out.println("Name: " + name + "\tAge: " + age + "\tGender: " + gender1 + "\n");
            }
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
    
}
