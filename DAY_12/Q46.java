public class Q46 {
    static int armstrong(int n) {
        int originalNumber = n;
        int result = 0;
        int digits = String.valueOf(n).length();
        
        while (n > 0) {
            int digit = n % 10;
            result += Math.pow(digit, digits);
            n /= 10;
        }
        
        return result == originalNumber ? 1 : 0;
    }
    public static void main(String[] args) {
        int n = 153;
        if (armstrong(n) == 1) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}