/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Student extends PersonProfile{
    
    private String course_name;
    private String course_code;
    private int sem;
    private int session;
    private int mark;
    private String file_name;
    private ArrayList<Integer> marks=new ArrayList<Integer>();

    public Student(String n, char g, String DOB,String file_name) {
        super(n, g, DOB);
        this.file_name=file_name;
    }

    
    
    
   

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
    
    public ArrayList readFile(){
        
        try{
        Scanner read=new Scanner(new FileReader("course.txt"));
        
        int i=0;
        
        while(read.hasNextLine()){
            this.course_code=read.nextLine();
            this.course_name=read.nextLine();
            this.session=Integer.parseInt(read.nextLine());
            this.sem=Integer.parseInt(read.nextLine());
            int x=Integer.parseInt(read.nextLine());
            marks.add(x);
            i++;
            
            
            
        }
        read.close();
        
        } catch(FileNotFoundException e){
            System.out.println("Error :" + e);
        }
        finally{
            
        }
        return marks;
    }
    
    
    public void getGrade(ArrayList<Integer> x){
        for(int i=0;i<x.size();i++){
            int y=x.get(i);
            
            if(y>=85){
                System.out.println("A");
            } else if(y>=75){
                System.out.println("A-");
            } else if(y>=70){
                System.out.println("B+");
            } else if(y>=65){
                System.out.println("B");
            } else if(y>=60){
                System.out.println("B-");
            } else if(y>=55){
                System.out.println("C+");
            } else if(y>=50){
                System.out.println("C");
            } else if(y>=45){
                System.out.println("D");
            } else if(y>=35){
                System.out.println("E");
            } else{
                System.out.println("F");
            }
            
        }
        
    
    }
    
    public String toString() {
        return super.toString()+"\nCourse Code: "+course_code+"\nCourse name: "+course_name+"\nSem: "+sem+"\nSessoion: "+session+"\nMark: "+ marks;
    
    
    }  

    
}
