import java.util.Arrays;
public class Q69 {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    } 
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("\nSorted Array: ");
        System.out.println(Arrays.toString(numbers));
    }
}