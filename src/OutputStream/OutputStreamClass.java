/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OutputStream;

import java.io.*;
import java.util.*;


/**
 *
 * @author Christin_Humber
 */
public class OutputStreamClass {

    public static void main(String[] args) throws IOException {
//    
//    /*
//        Intro into OutputStream
//        */
//    //Check the OutputStream class in Java docs
//    
//    //lets prove that it is a type of outputstream and then use the methods we saw in the docs

        System.out.write(100); //calling the write with byte array            
        System.out.flush();

        for(int i =97; i<= 122; i++)
            System.out.print(i);
            

        String s = "some words";
        System.out.println(s.length());
        System.out.write(s.getBytes(), 2, s.length() - 2); //calling the write with byte array          
        System.out.flush();
        

//            //FileOutputStream --> Writting to files
//            
//            
//            // 1st program lets write on a file from the system.in we saw (Append vs Overriding)
//            

        /*--------------------------------------------------------------------------*/
// Declare the FileOutputStream outside the try block  call it out
   
       

        try {
            // Create (or open) a file named "cpan211.txt" using the FileOutputStream constructor where we can append
            // The second argument 'true' means we are APPENDING to the file
            // If false, it would overwrite the file every time
            
            

            // Continuously read input from the keyboard (System.in)
            while (true) {
                // System.in.read() reads ONE character at a time (as an int)
                

                // ASCII 10 represents the ENTER key (newline '\n')
                // If the user presses ENTER, stop reading and break the loop
                //if () {
                    
                //} else {
                    // Otherwise, write the character into the file
                    
                //}
            }

            // After the loop ends, add a newline in the file

            // Flush ensures any buffered data is actually written to the file
       

        } catch (IOException ex) {
            // If any error happens (like file not found or no permission),
            // print the exception message
            System.out.println(ex);

        } finally {
            // Finally block always runs
            // We close the FileOutputStream to free system resources
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing the file: " + ex);
            }
        }


    }

}
