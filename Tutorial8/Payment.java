/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg4;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Payment {
    private String paymentType, chequeNumber, cardNumber, cardType;
        private String expirationDate, validationCode;
        private double amount;
        
        public Payment(double a){
        paymentType = "cash";
        amount = a;
        }
        public Payment(double a, String b){
        paymentType = "Cheque";
        amount = a;
        chequeNumber = b;
        }
        public Payment(double a, String b, String c, String d, String e){
        paymentType = "Credit Card";
        amount = a;
        cardNumber = b;
        cardType = c;
        expirationDate = d;
        validationCode = e;
        }
        }

