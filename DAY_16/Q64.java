public class Q64 {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueCount - 1]) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("The array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}