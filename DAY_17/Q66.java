import java.util.HashSet;
import java.util.Set;
public class Q66 {
    public static void main(String[] args) {
      int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 3, 4, 5, 6};
        Set<Integer> unionSet = new HashSet<>();
for (int num : array1) {
            unionSet.add(num);  
        }
        for (int num : array2) {
            unionSet.add(num);
        }
        System.out.println("Array 1: 1, 3, 5, 7, 9");
        System.out.println("Array 2: 2, 3, 4, 5, 6");
        System.out.println("Union of both arrays: " + unionSet);
 
        }
    }
