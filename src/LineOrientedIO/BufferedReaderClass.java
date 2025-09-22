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
        try (
            // Create a BufferedReader to read from an existing file ("cpan211.txt")
            // BufferedReader allows us to read text line by line efficiently
            //BufferedReader in = new BufferedReader(new FileReader("cpan211.txt"));

            // Create a FileWriter to write into another file ("Destination.txt")
            // Note: this will OVERWRITE the file unless we use the constructor with 'true' for append
            //FileWriter out = new FileWriter("Destination.txt")
        ) {

            String line;

            // Keep reading the file line by line
            // readLine() returns null when we reach the END of the file
            //while ((line = in.readLine()) != null) {

                // Print each line to the console so we can see the content
                //System.out.println(line + "\n");

                // Write the same line into the destination file
                //out.write(line + "\n");

            //}

        } catch (IOException ex) {
            // If something goes wrong (like file not found, or no permission),
            // print the exception message
            System.out.println(ex);
        }

    }

}
