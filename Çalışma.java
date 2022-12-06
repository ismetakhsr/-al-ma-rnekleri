/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çalışma;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Çalışma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan= new Scanner (System.in);
    System.out.println("Lütfen adınızı giriniz");
    String isim = scan.nextLine();
    System.out.println("Lütfen soyisminizi giriniz");
    String soyisim = scan.nextLine();
    System.out.println("Lütfen yaşınızı giriniz");
    double yaş = scan.nextDouble();
    System.out.println("İsminiz = " + isim + "\nSoyisminiz = " + soyisim + "\nYaşınız = " + yaş +  "\nKaydınız başarıyla tamamlanmıştır"  );
    
    
    
    
    
    
    
    
    }
    
}
