package inner_class;

public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        void greet();

        void greetSomeone(String someone);

        String getLang();
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

                    public String getLang() {
                        return "EN";
                    }
                },
                new HelloWorld() {
                    public void greet() {
                        greetSomeone("Bonsoir tout le monde!");
                    }

                    public void greetSomeone(String someone) {
                        System.out.println("Bonsoir " + someone);
                    }

                    public String getLang() {
                        return "FR";
                    }
                },
                new HelloWorld() {
                    public void greet() {
                        greetSomeone("Hola a todas!");
                    }

                    public void greetSomeone(String someone) {
                        System.out.println("Hola " + someone);
                    }

                    public String getLang() {
                        return "ES";
                    }
                },
                new HelloWorld() {
                    public void greet() {
                        greetSomeone("Bună seara!");
                    }

                    public void greetSomeone(String someone) {
                        System.out.println("Salut " + someone);
                    }

                    public String getLang() {
                        return "RO";
                    }
                }}) {
            hw.greetSomeone(name + " (" + hw.getLang() + ")");
        }
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello("Seria CB");
    }
}
