package inner_class;

public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        void greet();

        void greetSomeone(String someone);
    }

    public void sayHello(String name) {
        for (HelloWorld hw : new HelloWorld[]{
                new HelloWorld() {
                    public void greet() {
                        greetSomeone("Hey everybody!");
                    }

                    public void greetSomeone(String someone) {
                        System.out.println("Hello " + someone);
                    }
                },
                new HelloWorld() {
                    public void greet() {
                        greetSomeone("Bonsoir tout le monde!");
                    }

                    public void greetSomeone(String someone) {
                        System.out.println("Bonsoir " + someone);
                    }
                },
                new HelloWorld() {
                    public void greet() {
                        greetSomeone("Hola a todas!");
                    }

                    public void greetSomeone(String someone) {
                        System.out.println("Hola " + someone);
                    }
                },
                new HelloWorld() {
                    public void greet() {
                        greetSomeone("Bună seara!");
                    }

                    public void greetSomeone(String someone) {
                        System.out.println("Salut " + someone);
                    }
                }}) {
            hw.greetSomeone(name);
        }
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello("Seria CB");
    }
}
