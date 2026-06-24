public class Q22 {
    public static void main(String[] args) {
         int bintodec = 0, i = 0, rem; 
int num = 1010; 
         while (num != 0) {
             rem = num % 10;
             bintodec = bintodec + rem * (int) Math.pow(2, i);
             num = num / 10;
             i++;
         }
         System.out.println("Decimal number: " + bintodec);
    }
}     
    