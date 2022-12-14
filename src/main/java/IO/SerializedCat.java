package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat {
    private String description;

    Cat() {
        this.description = "fluffy cat";
    }

    public Cat(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class SerializableCat extends Cat implements Serializable {
    public SerializableCat() {
        super("puffy");
    }
}

public class SerializedCat {
    public static void main(String[] args) {
        SerializableCat c = new SerializableCat();
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/main/resources/testSer.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/testSer.ser"))) {
            os.writeObject(c);
            c = (SerializableCat) ois.readObject();
            System.out.println(c.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
