/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.io.FileOutputStream;
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner c = new Scanner (System.in);
        System.out.println(" Nendy Chandra 1842808 ");
        
        try {
            FileOutputStream output = new FileOutputStream("Latihan1");
            System.out.println("Masukan Data: ");
            output.write(c.nextLine().getBytes());
            output.close();
        } catch (Exception e){
        }
    }
    
}
