public class Q50 {
    public static void main(String[] args) {
        int[] arr = {10, 22, 23, 48, 45};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
     System.out.println("Sum of array elements: " + sum);
    System.out.println("Average of array elements: " + (double) sum / arr.length);

    }
    }
