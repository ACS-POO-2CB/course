package exceptions;

public class AssertWhat {
    void print() {
        System.out.println(this.getClass());
    }
    public static void main(String[] args) {
        int x = 3;
//        char a = 'a';
//        assert Math.pow(x, 3) > a - 'A' : "Not good";
//        System.out.println(a - 'A');


        AssertWhat a = new AssertWhat();
        a.print();
    }
}
