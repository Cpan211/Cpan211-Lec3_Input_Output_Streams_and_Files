/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputStream;

import java.io.*;
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
            int b = System.in.read();
            System.out.println(b);
            //After reading it lets write it to the outputstream
            System.out.write(b);
            System.out.flush();
            

            //--Lets read bytes of data
//            byte[] input = new byte[10];
//            System.in.read(input);
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
//            FileInputStream in = new FileInputStream("cpan211.txt");
//
//            byte[] d = new byte[in.available()];
////the meaning of -1 and let's talk about available() || we can use a for loop too
////            in.read(d);
////
////            System.out.println("Array size is: " + d.length);
////
////            for (int i = 0; i < d.length; i++){
////                    System.out.write(d[i]);
////            }
////            System.out.flush();
//
//           
//            while (true) {
//                int data = in.read();
//                if (data == -1) {
//                    System.out.println("End of stream/file");
//                    break;
//                } else {
//
//                    System.out.write(data);
//
//                }
//
//                System.out.flush();
//
//            }
            // remember to always close the stream when we are done with it-->finally key word
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
