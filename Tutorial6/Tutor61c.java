/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor61c;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor61c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(Comb(10,5));
        
    }
      public static int Comb(int n, int k){

                  int comb;

                  int EXn=1, EXk=1, EXnk=1;

                  for(int i=1; i<=n; i++)

                           EXn*=i;

                  for(int i=1; i<=k; i++)

                           EXk*=i;

                  for(int i=1; i<=n-k; i++)

                           EXnk*=i;

                  comb = EXn/(EXk*EXnk);

                  return comb;

       }

    }
    

