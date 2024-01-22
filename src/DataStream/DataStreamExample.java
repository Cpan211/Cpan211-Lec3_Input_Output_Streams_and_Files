/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStream;

/**
 *
 * @author Christin_Humber
 */
import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "cpan211.dat";

        // Writing data to a file using DataOutputStream
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing primitive data types to the file
            dataOutputStream.writeInt(42);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeBoolean(true);
            String s = "Hello, Class";
            dataOutputStream.writeUTF(s);
        } catch (IOException e) {
            System.err.println( e.getMessage());
        }

        // Reading data from the file using DataInputStream
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            int intValue = dataInputStream.readInt();
            double doubleValue = dataInputStream.readDouble();
            boolean booleanValue = dataInputStream.readBoolean();
            String stringValue = dataInputStream.readUTF();

            // Display the read data
            System.out.println("Int Value: " + intValue);
            System.out.println("Double Value: " + doubleValue);
            System.out.println("Boolean Value: " + booleanValue);
            System.out.println("String Value: " + stringValue);
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}
