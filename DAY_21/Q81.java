public class Q81 {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = 0;
        
        for (char c : str.toCharArray()) {
            length++;
        }
        
        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + length);
    }
}