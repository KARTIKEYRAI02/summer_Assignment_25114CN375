public class Q86 {
public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
public static void main(String[] args) {
        String testSentence1 = "This is a sample sentence.";
        String testSentence2 = "   Java   programming  is fun!   ";
        String testSentence3 = "";

        System.out.println(countWords(testSentence1));
        System.out.println(countWords(testSentence2));
        System.out.println(countWords(testSentence3));
    }
}