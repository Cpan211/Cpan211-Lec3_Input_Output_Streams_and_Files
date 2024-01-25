/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OutputStream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
////        System.out.println("fkljds");
////        
//        for(int i =97; i<= 122; i++)
//            System.out.write(i);
//        System.out.flush();

//    //Writing just 1 byte on the console
//    
//    //Difference between byte and character streams(ASCII)
//    
//    //how to convert string into byte array and use it to write on the console
//            // remember to always close the stream when we are done with it-->finally key word
//            
//            
//            //-- Let's talk about the input stream before moving on to FileOutputStream
//            
//            
//            /**
//             *
//             * --------------------------------------------------------------
//             */
//            
//            //FileOutputStream --> Writting to files
//            
//            
//            // 1st program lets write on a file from the system.in we saw (Append vs Overriding)
//            

        /*--------------------------------------------------------------------------*/
//FileOutputStream out = null;
//
//
//try{
//    
//    out = new FileOutputStream("cpan211.txt",true);
//    while(true){
//        int input = System.in.read();
//        if (input==10) {
//            break;
//        }else{
//        out.write(input);
//    }
//}
//    System.out.flush();
//    
//}catch (IOException ex) {
//System.out.println(ex);
//    
//
//
//
//}
        System.out.write(100); //calling the write with byte array            
        System.out.flush();


        String s = "some words";
        System.out.println(s.length());
        System.out.write(s.getBytes(), 2, s.length() - 2); //calling the write with byte array          
        System.out.flush();

    }

}
