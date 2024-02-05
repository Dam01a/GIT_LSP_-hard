package org.howard.edu.lsp.assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) throws IOException {
    	String filePath = "words.txt.txt";

        Map<String, Integer> wordCountMap = new HashMap();

        FileInputStream fis = new FileInputStream(filePath);
        byte[] data = new byte[fis.available()];
        fis.read(data);
        fis.close();  // Close the FileInputStream

        String content = new String(data);
        String[] lines = content.split("\\r?\\n");

        for (String line : lines) {
            String[] words = line.toLowerCase().split("\\s+");

            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        // Print the word count
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
    }
}