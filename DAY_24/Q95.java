public class Q95 {
public static String findLongest(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
public static void main(String[] args) {
        String testSentence = "The quick brown fox jumped over the lazy dog";
        System.out.println(findLongest(testSentence));
    }
}