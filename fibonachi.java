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

public class fibonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int birinci =1;
        System.out.println(birinci);
        int ikinci =1;
        System.out.println(ikinci);
        int yeni ;
        for (int i=3; i<11; i++){
            yeni=birinci+ikinci;
            System.out.println(yeni);
            birinci=ikinci;
            ikinci=yeni;
        }
                        
   
    }
    
}
