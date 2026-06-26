public class Q48 {
    static int perfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n ? 1 : 0;
    }
    public static void main(String[] args) {
        int n = 28;
        if (perfect(n) == 1) {
            System.out.println("The number is a perfect number.");
        } else {
            System.out.println("The number is not a perfect number.");
        }
    }
}