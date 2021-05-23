/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Student {
    private String contact;
    public Student(){
        contact="";
    }
    public Student(String a){
        contact=a;
    }
    public String toString(){
        return "Contact Numer: " + contact;
    }
    public void setContact(String a){
        contact = a;
    }
    public String getContact(){
        return contact;
    }
    //i
    
}
