package Practice.HashMap;

import java.util.HashMap;

public class WordCount {

    public static void countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) return;

        // Create a new map every time the method is called
        HashMap<String, Integer> words = new HashMap<>();

        for (String word : sentence.toLowerCase().split(" ")) {
            if (word.isEmpty()) continue; // Skip empty words
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        for (var entry : words.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sentence = "Ti this ti this is a man wild no man wild";
        WordCount.countWords(sentence);
    }
}
