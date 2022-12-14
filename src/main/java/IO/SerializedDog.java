package IO;

import java.io.*;

class Collar implements Serializable{
    private int collarSize;

    public Collar(int size) {
        collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }
}

class Dog implements Serializable {
    private transient Collar theCollar;
    private int dogSize;

    public Dog(Collar collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar getTheCollar() {
        return theCollar;
    }

    public void setTheCollar(Collar theCollar) {
        this.theCollar = theCollar;
    }

    public int getDogSize() {
        return dogSize;
    }

    public void setDogSize(int dogSize) {
        this.dogSize = dogSize;
    }
}

class SpecialDog implements Serializable {
    transient private Collar theCollar;
    private int dogSize;

    public SpecialDog(Collar collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar getTheCollar() {
        return theCollar;
    }

    public void setTheCollar(Collar theCollar) {
        this.theCollar = theCollar;
    }

    public int getDogSize() {
        return dogSize;
    }

    public void setDogSize(int dogSize) {
        this.dogSize = dogSize;
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        os.writeInt(theCollar.getCollarSize());
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        theCollar = new Collar(is.readInt());
    }
}

public class SerializedDog {
    public static void main(String[] args) {
        Collar c = new Collar(3);
        SpecialDog doggy = new SpecialDog(c, 7);
        System.out.println("before: doggy of size " + doggy.getDogSize() + " with collar of size " + doggy.getTheCollar().getCollarSize());
        doggy = (SpecialDog) writeRead(doggy);
        System.out.println("after: doggy of size " + doggy.getDogSize() + " with collar of size " + doggy.getTheCollar().getCollarSize());

        Dog d = new Dog(c, 5);
        System.out.println("before: dog of size " + d.getDogSize() + " with collar of size " + d.getTheCollar().getCollarSize());
        d = (Dog) writeRead(d);
        System.out.println("after: dog of size " + d.getDogSize() + " with collar of size " + d.getTheCollar().getCollarSize());
    }

    private static Object writeRead(Object d) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/main/resources/testSer.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/testSer.ser"))) {
            os.writeObject(d);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
