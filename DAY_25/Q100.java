import java.util.Arrays;
import java.util.Comparator;
public class Q100{
public static void sortWords(String[] words) {
        if (words == null || words.length == 0) {
            return;
        }
        
        Arrays.sort(words, Comparator.comparingInt(String::length));
    }
public static void main(String[] args) {
        String[] words = {"elephant", "cat", "zebra", "dog", "hippopotamus"};
        
        sortWords(words);
        System.out.println(Arrays.toString(words));
    }
}