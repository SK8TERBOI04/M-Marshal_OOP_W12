import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Person p = (Person) in.readObject();

            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());

            in.close();
            fileIn.close();

        } catch(IOException i) {
            i.printStackTrace();
        } catch(ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.printStackTrace();
        }
    }
}
