import java.util.Arrays;
public class Q99 {
public static void sortAlphabetically(String[] names) {
        if (names == null || names.length == 0) {
            return;
        }
        
        Arrays.sort(names);
    }
public static void main(String[] args) {
        String[] names = {"Charlie", "Alice", "Bob", "Eve"};
        
        sortAlphabetically(names);
        System.out.println(Arrays.toString(names));
    }
}