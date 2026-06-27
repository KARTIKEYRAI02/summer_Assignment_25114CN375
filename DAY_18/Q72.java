import java.util.Arrays;
public class Q72 {
    public static void sortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {15, 3, 28, 9, 11, 42};
        
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(numbers));
        
        sortDescending(numbers);
        
        System.out.println("\nArray in Descending Order: ");
        System.out.println(Arrays.toString(numbers));
    }
}