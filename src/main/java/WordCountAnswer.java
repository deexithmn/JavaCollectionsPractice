import java.util.Arrays;

public class WordCountAnswer {
    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the number of occurrences of word in source
    static int getOccurrences(String source, String word) {
        // Your code goes here.
        return (int) Arrays.asList(source.replaceAll("[.,]", "").split(" ")).stream().filter(str -> str.equalsIgnoreCase(word)).count();
    }
}
