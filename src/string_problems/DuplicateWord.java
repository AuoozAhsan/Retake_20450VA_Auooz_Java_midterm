package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
    duplicateWords(string);
    }
        public static void duplicateWords(String string){
        String[] words = string.split("\\s+");

        Map<String, Integer> wordFrequency = new HashMap<>();

        int totalLength = 0;
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            totalLength += word.length();
        }


        double averageLength = (double) totalLength / words.length;

        System.out.println("Duplicate words and their occurrences:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }

        // Print average word length
        System.out.println("Average word length: " + averageLength);

    }

}