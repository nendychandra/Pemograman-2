/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.io.FileInputStream;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author USER
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileInputStream PERSIB = new FileInputStream ("PERSIB.txt");
            int nilai;
            while ((nilai = PERSIB.read()) != -1) {
                if((char)nilai == ' '){
                    System.out.print('_');
                } else {
                    System.out.print((char)nilai);
                }
            }
            PERSIB.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
    }
    
}
