public class Q21 {
    public static void main(String[] args) {
         int dectobin = 0, i = 0, rem;
         int num = 10; 
         while (num != 0) {
             rem = num % 2;
             dectobin = dectobin + rem * (int) Math.pow(10, i);
             num = num / 2;
             i++;
         }
         System.out.println("Binary number: " + dectobin);
    }
}