/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class PersonProfile {
    private String name;
    protected char gender;
    protected String date_of_birth;
    
    public PersonProfile(String n,char g, String DOB){
        this.name=n;
        this.gender=g;
        this.date_of_birth=DOB;
    }

    public PersonProfile() {
    }
    

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Name: "+ name+"\nGender: "+gender+"\nDate_of_birth: "+date_of_birth ;
    }
    
    
    public void display(){
        System.out.println(this.getName()+" "+this.getGender()+" "+this.getDate_of_birth());
    }
    
    
}
