package IO;

import java.io.*;


class Player {
    Player() { System.out.print("p"); }
}
class Ci extends Player implements Serializable {
    Ci() { System.out.print("c"); }

    public static void main(String[] args) {
        Ci c1 = new Ci();
        try {
            FileOutputStream fos = new FileOutputStream("play.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(c1);
            os.close();

            FileInputStream fis = new FileInputStream("play.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            Ci c2 = (Ci) is.readObject();
            is.close();
        } catch (Exception x ) { }
    }
}
