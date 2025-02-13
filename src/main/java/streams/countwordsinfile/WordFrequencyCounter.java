package streams.countwordsinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    // Function to count word occurrences in a file
    private static Map<String, Integer> countWordsInFile(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+"); // Split by non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return wordCountMap;
    }

    // Function to print the top N most frequent words
    private static void printTopFrequentWords(Map<String, Integer> wordCountMap, int n) {
        wordCountMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .limit(n)
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

    public static void main(String[] args) {

        String filePath = "src/main/java/streams/countwordsinfile/input.txt";
        Map<String, Integer> wordCountMap = countWordsInFile(filePath);

        printTopFrequentWords(wordCountMap, 5);

    }
}
