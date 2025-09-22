/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputStream;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christin_Humber
 */
public class InputStreamClass {

    public static void main(String[] args) {

        try {
            /*
            Intro into InputStream
             */
            //Check the InputStream class in Java docs

            //lets prove that it is a type of inpustream and then use the methods we saw in the docs
            //reading just 1 byte on the console
//            int b = System.in.read();
//            System.out.println(b);
//            //After reading it lets write it to the outputstream
//            System.out.write(b);
//            System.out.flush();
//            System.out.println();
//            
//
            ////            --Lets read bytes of data
//            byte[] input = new byte[10];
//            System.in.read(input);
//            System.out.println(Arrays.toString(input));
//            for (int i = 0; i < input.length; i++) {
//                System.out.write(input[i]);
//            }
//            System.out.flush();
            /**/
 /*------------------------------------------------------------------------------------------*/
            /**
             * Now that we understand how it works let's starts FileinputStream
             *
             */
//
//            //Let's create an object of reference InputStream but object of FileinputStream -- See notes
            FileInputStream in = new FileInputStream("cpan211.txt");

// Reading One Byte at the time.
            // Keep reading data from the InputStream until we reach the end
            while (true) {
                // Create a data variable and read from the file, use The read() method reads ONE byte and returns it as an int
                // If we reach the end of the file/stream, read() will return -1

                // If data == -1, it means we hit the END of the stream/file
                // In that case, print a message and break the loop
                //if () {
                //    System.out.println("End of stream/file");
                //    break;
                //} else {
                //    // Otherwise, write the data to the console (System.out)
                //}
                // Flush ensures the output actually shows up immediately
                // (especially important when writing to files)
            }

// Reading all available bytes into an array      
            // Create a byte array large enough to hold all available data
            // available() tells us how many bytes can be read without blocking
            //byte[] d = new byte[in.available()];
            // The read(byte[] b) method fills the array with data from the stream
            // Note: returns -1 if end of stream
            //in.read(d);
            // Print out the size of the array we just filled
            //System.out.println("Array size is: " + d.length);
            // Loop through the array and write each byte to the console
            //for (int i = 0; i < d.length; i++) {
            //    System.out.write(d[i]);
            //}
            // Flush so all bytes are displayed
            //System.out.flush();
        } catch (IOException ex) {
            // Print the exception if something goes wrong
            System.out.println(ex);
        }                // remember to always close the stream when we are done with it --> finally block

    }

}
