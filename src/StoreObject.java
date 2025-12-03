import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreObject {
    public static void main(String[] args) {

        Person p = new Person("John", 20);

        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(p);

            out.close();
            fileOut.close();

            System.out.println("Serialized data is saved in person.ser");
        } catch(IOException i) {
            i.printStackTrace();
        }
    }
}
