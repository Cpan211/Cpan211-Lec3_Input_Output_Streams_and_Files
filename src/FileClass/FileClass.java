/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileClass;

/**
 *
 * @author Christin_Humber
 */

import java.io.File;

public class FileClass {

    public static void main(String[] args) {
     //Check the javadocs api for File Class


     //create a file object
     
     File f = new File("cpan211.txt");

     //check if file exist
     if(f.exists()){
         System.out.println("File exist :)");
         System.out.println(f.getAbsolutePath());
         System.out.println("Is it a Dir " + f.isDirectory());
         
     }else{
     
         System.out.println("File doesn't exist! :(");
         
     }
            

   }
 
}