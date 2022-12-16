package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestHash {
    private Integer a;
    private String s;

    public TestHash(int a) {
        super();
        this.a = a;
    }

    @Override
    public int hashCode() {
        return a % 10;
//       return Objects.hash(a, s);
    }

    @Override
    public boolean equals(Object obj) {
        TestHash other = (TestHash) obj;
        if (a % 10 != other.a % 10)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return a + "";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Set<TestHash> set = new HashSet();
        set.add(new TestHash(100));
        set.add(new TestHash(20));
        System.out.println(set);
    }

}
