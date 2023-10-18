package collections;

import java.util.*;

public class CountWordOccurrences {
    public static void main(String[] args) {
        // Set text in a string
        String text = """
                Good morning. Have a great day!
                Have a good visit. Have fun!""";

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
            System.out.println(entry.getValue() + "\t" + entry.getKey());

        // Please never do this
        for (String s : map.keySet())
            System.out.println(s + "\t" + map.get(s));
    }
}
