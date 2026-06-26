public class Q47 {
    static int fibonacciseries(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciseries(n - 1) + fibonacciseries(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciseries(i) + " ");
        }
    }
}
