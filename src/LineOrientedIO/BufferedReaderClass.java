/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LineOrientedIO;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class BufferedReaderClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (BufferedReader in = new BufferedReader(new FileReader("cpan211.txt"))) {

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line+"\n");
                
            }
        } catch (IOException ex) {
            
            System.out.println(ex);
        }

    }

}
