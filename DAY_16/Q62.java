public class Q62 {
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1};
        int maximum = findMaximum(arr);
        System.out.println("The maximum number is: " + maximum);
    }
}