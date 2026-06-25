public class Q40 {
    public static void main(String[] args) {
        int rows = 4;
        char ch = 'A';
        for (int i = 0; i <= rows; i++) {
            for (int j = rows-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char)(ch + k));
            }
            for (int l = i - 1; l >= 0; l--) {
                System.out.print((char)(ch + l));
            }
            System.out.println();
        }
    }
}