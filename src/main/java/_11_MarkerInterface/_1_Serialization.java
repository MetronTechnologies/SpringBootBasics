package _11_MarkerInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _1_Serialization {

    static String filePath = "dir.txt";
    static String message = "First serialization";

    public static void main(String [] args){
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("Serializing");
            oos.writeObject(message);
        } catch (IOException error){
            System.err.println(error);
        }
    }





}
