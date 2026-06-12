public class Q14 {
    public static long findNthFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int prev2 = 0;
        int prev1 = 1;
        int next = 0;

        for (int i = 2; i <= n; i++) {
            next = prev1 + prev2;
            prev2 = prev1;
            prev1 = next;
        }
    return next;
    }
    public static void main(String[] args) {
        int n = 13; 

    
    

        System.out.println("The " + n + "th Fibonacci number is: " + findNthFibonacci(n));
    }
}