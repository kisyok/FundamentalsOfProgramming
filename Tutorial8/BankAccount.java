/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab82;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class BankAccount {
    private String name;
    private String icOrPassport;
    private double balance;
    
public BankAccount(String name, String icOrPassport, double deposit){
    this.name = name;
    this.icOrPassport = icOrPassport;
    this.balance = deposit;
}
public void deposit(double amt){
    balance += amt;
}
public void withdrawal(double amt){
    balance -= amt;
}

    @Override
    public String toString() {
        return  "name: " + name + "\n" + "icOrPassport: " + icOrPassport + "\n" + "balance: " + balance;
    }

}
