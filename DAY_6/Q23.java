public class Q23 {
    public static void main(String[] args) {
        int countbits = 0;
        int n = 5;
        while (n != 0) {
            countbits++;
            n = n & (n - 1);
        }
        System.out.println("Number of set bits: " + countbits);
    }
}