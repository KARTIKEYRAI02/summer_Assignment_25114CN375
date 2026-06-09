import java.util.Scanner;
public class Q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a= sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
    int gcd = findGCD(a, b);
    int lcm = (a * b) / gcd;

    System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
  }

  public static int findGCD(int a, int b) {
    if (b == 0)
      return a;
    return findGCD(b, a % b);
  }
}


