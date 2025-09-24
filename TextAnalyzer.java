public class TextAnalyzer {

    // Count the number of words
    public static int countWords(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) return 0;
        String[] words = paragraph.trim().split("\\s+");
        return words.length;
    }

    // Find the longest word
    public static String findLongestWord(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) return "";

        String[] words = paragraph.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            String cleaned = word.replaceAll("[^a-zA-Z]", ""); // Remove punctuation
            if (cleaned.length() > longest.length()) {
                longest = cleaned;
            }
        }

        return longest;
    }

    // Replace all occurrences of a word (case-insensitive)
    public static String replaceWord(String paragraph, String target, String replacement) {
        if (paragraph == null || paragraph.trim().isEmpty()) return "";

        return paragraph.replaceAll("(?i)\\b" + target + "\\b", replacement);
    }

    // Example usage
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. It contains several words, including Sample and SAMPLE.";

        System.out.println("Word Count: " + countWords(paragraph));
        System.out.println("Longest Word: " + findLongestWord(paragraph));
        System.out.println("Replaced Text: " + replaceWord(paragraph, "sample", "example"));
    }
}

