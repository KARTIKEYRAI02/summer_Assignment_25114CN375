public class Q24 {
    public static void main(String[] args) {
        int base = 2, exponent = 5;
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        System.out.println("Result: " + result);
    }
}