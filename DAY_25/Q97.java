public class Q97 {
public static int[] merge(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        if (arr2 == null) {
            return arr1;
        }
        
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
        
        return merged;
    }
public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        int[] result = merge(arr1, arr2);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}