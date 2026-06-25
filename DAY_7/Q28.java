public class Q28 {
    public static void Reverse(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        } 
        else {
            System.out.print(n % 10);
            Reverse(n / 10);
        }
    }
    public static void main(String[] args) {
        int n = 58941; 
        System.out.print("Reverse of " + n + " is: ");
        Reverse(n);
    }
}