package basic_objects;

public class ColorRecord{

    // An immutable data carrier: fields, constructor, accessors,
    // equals(), hashCode() and toString() are generated automatically.
    record Color(String name, int red, int green, int blue) {

        // A limited set of predefined colors
        static final Color RED    = new Color("Red",    255,   0,   0);
        static final Color GREEN  = new Color("Green",    0, 255,   0);
        static final Color BLUE   = new Color("Blue",     0,   0, 255);
        static final Color YELLOW = new Color("Yellow", 255, 255,   0);
        static final Color WHITE  = new Color("White",  255, 255, 255);

        String toHex() {
            return String.format("#%02X%02X%02X", red, green, blue);
        }

        boolean isDark() {
            return (red + green + blue) / 3 < 128;
        }
    }

    public static void main(String[] args) {
        Color[] palette = {
                Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.WHITE, // predefined
                new Color("Orange", 255, 165,   0),                          // new ones
                new Color("Purple", 128,   0, 128),
                new Color("Pink",   255, 192, 203)
        };

        int darkCount = 0;
        for (Color c : palette) {
            System.out.println(c.name() + " " + c.toHex() + (c.isDark() ? " (dark)" : " (light)"));
            if (c.isDark()) {
                darkCount++;
            }
        }
        System.out.println("Dark colors: " + darkCount + " of " + palette.length);

        System.out.println(Color.RED); // auto-generated toString()
    }
}
