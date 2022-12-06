/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çalışma;

/**
 *
 * @author Toshiba
 */
import java.util.Scanner ;
public class forexample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz");
        Scanner input= new Scanner (System.in);
        int giriş = input.nextInt();
        int sonuç=1;
       
        for ( int i=1 ; i<=giriş; i++) {
            sonuç=sonuç*i;                        
        }
        System.out.println(sonuç);                                     
       
    }
    
}

