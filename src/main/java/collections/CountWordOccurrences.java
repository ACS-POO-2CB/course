package collections;

import java.util.*;

public class CountWordOccurrences {
    public static void main(String[] args) {
        // Set text in a string
        String text = """
                Good day. Have a great day with POO! Poo is simply great.
                Enjoy your holidays. Have fun!""";

        // Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[ \n\t\r.,;:!?(){}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (words[i].length() > 1) {
                if (map.get(key) == null) {
                    map.put(key, 0);
                }
                map.put(key, map.get(key) + 1);
            }
        }

        // Get key and value from each entry
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + "\t" + entry.getValue());

        // Please NEVER EVER EVER do this
        for (String s : map.keySet())
            System.out.println(s + "\t" + map.get(s));
    }
}
