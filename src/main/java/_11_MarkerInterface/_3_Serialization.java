package _11_MarkerInterface;

import java.io.*;

public class _3_Serialization implements Serializable {

    private static final long serialversionuid = 1234L;

    private long studentId;
    private String name;
    private transient int age;

    public _3_Serialization(long SI, String nm, int ag){
        super();
        this.studentId = SI;
        this.name = nm;
        this.age = ag;
    }

    @Override
    public String toString() {
        return "_3_Serialization{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    private static String filePath = "students.txt";


    public static void main(String[] args) {

        _3_Serialization student = new _3_Serialization(123, "John", 23);

        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(student);
        } catch (IOException error) {
            System.err.println(error);
        }

        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            _3_Serialization studentRecord = (_3_Serialization) inputStream.readObject();
            System.out.println(studentRecord);
        } catch (IOException error) {
            System.err.println(error);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
