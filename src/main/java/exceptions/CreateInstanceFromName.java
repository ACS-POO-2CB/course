package exceptions;

import java.lang.reflect.InvocationTargetException;

public class CreateInstanceFromName {
    private String name;

    public CreateInstanceFromName(String name) {
        this.name = name;
    }

    public CreateInstanceFromName() {
        this.name = "wow";
    }

    public String getName() {
        return name;
    }

    public static <T> T createInstance(String className, Class<T> c) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return c.cast(c.getDeclaredConstructor().newInstance());
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String className = "exceptions.CreateInstanceFromName";

        CreateInstanceFromName instance1 = (CreateInstanceFromName) Class.forName(className).getDeclaredConstructor().newInstance();

        System.out.println(instance1.getName());

        for (int i=0, j=0; i < 10; i++, j+=2) {
            System.out.println(i + " " + j);
        }

        Object instance2 = Class.forName(className).cast(Class.forName(className).getDeclaredConstructor(String.class).newInstance("spectacular"));

        System.out.println(((CreateInstanceFromName)instance2).getName());
    }
}