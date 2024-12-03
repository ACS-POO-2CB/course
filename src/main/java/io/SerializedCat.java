package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat {
    private String description;

    public Cat() {
        this.description = "I am fluffy";
        System.out.println("Default cat");
    }

    public Cat(String description) {
        this.description = description;
        System.out.println("Cat Non-serializable");
    }

    public String getDescription() {
        return description;
    }
}

class SerializableCat extends Cat implements Serializable {
    public SerializableCat() {
        super("Puffy");
        System.out.println("Serializable");
    }
}

public class SerializedCat {
    public static void main(String[] args) {
        SerializableCat c = new SerializableCat();
        System.out.println("-----------------");

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
