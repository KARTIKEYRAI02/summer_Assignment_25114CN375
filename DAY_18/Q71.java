import java.util.Arrays;
public class Q71 {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
                if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
        public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        
        int result = binarySearch(numbers, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}