package inner_class;

class BaseOuter {
    static class NestedMember {
        void goBase() {
            System.out.println("Hi from the base nested member!");
        }
    }
}

public class BigOuter extends BaseOuter {
    static class Nest {
        void go() {
            System.out.println("Hi");
        }
    }

    static class NestedMember extends BaseOuter.NestedMember {
        void goDerived() {
            System.out.println("Hi from the derived nested member!");
        }
    }

    public static void main(String[] args) {
        BigOuter.Nest n = new BigOuter.Nest(); // both class names
        n.go();
        BigOuter.NestedMember member = new BigOuter.NestedMember();
        member.goBase();
        member.goDerived();
    }
}


