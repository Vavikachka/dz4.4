
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Human human1 = new Human(0 , "Ваня");
        Human human2 = new Human(1 , "Коля");

        try {
            FileOutputStream fos = new FileOutputStream("workes.bin");
            ObjectOutputStream cos = new ObjectOutputStream(fos);

            cos.writeObject(human1);
            cos.writeObject(human2);

            cos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
