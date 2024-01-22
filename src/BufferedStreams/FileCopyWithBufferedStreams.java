/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferedStreams;

/**
 *
 * @author Christin_Humber
 */
import java.io.*;

public class FileCopyWithBufferedStreams {
    
    public static void main(String[] args) {
        String sourceFileName = "source.txt"; 
        String destinationFileName = "destination.txt"; 

        try (
            FileInputStream fileInputStream = new FileInputStream(sourceFileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ) {
            int bufferSize = bufferedInputStream.available(); // Use available() to determine buffer size

            byte[] buffer = new byte[bufferSize];
//            int bytesRead;

            while ((bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
