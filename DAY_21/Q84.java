public class Q84 {
public static void main(String[] args) {
        String str = "hello java programming";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        
        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + result.toString());
    }
}