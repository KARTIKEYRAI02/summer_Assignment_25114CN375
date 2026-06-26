public class Q57 {
    public static void main(String[] args) {
        int[] arr = {10, 22, 23, 48, 45};
        System.out.print("Array elements in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}