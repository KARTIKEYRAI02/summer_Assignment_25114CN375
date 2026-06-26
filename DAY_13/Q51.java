public class Q51 {
    public static void main(String[] args) {
        int arr[] = {10, 82, 13, 21, 23};
        int largest = arr[0],smallest = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}