import java.util.Arrays;
public class Q59 {
    static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3; 
        rotateArray(arr, d);
        System.out.println("Array after rotating " + d + " times to the right: " + Arrays.toString(arr));
    }
}