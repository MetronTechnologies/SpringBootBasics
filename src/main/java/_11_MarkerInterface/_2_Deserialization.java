package _11_MarkerInterface;

import java.io.*;

public class _2_Deserialization {

    private static String filePath = "dir.txt";


    public static void main(String[] args) {
        try{
            FileInputStream fos = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fos);
            String message = (String) inputStream.readObject();
            System.out.println(message);
        } catch (IOException error){
            System.err.println(error);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
