public class Q56 {
    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 4, 5, 6, 5, 38, 9, 1};
        System.out.print("Duplicate elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; 
                }
            }
        }
    }
}