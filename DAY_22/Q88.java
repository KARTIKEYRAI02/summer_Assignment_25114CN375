public class Q88 {
public static String removeSpaces(String str) {
        if (str == null) {
            return null;
        }
        
        return str.replaceAll("\\s+", "");
    }
public static void main(String[] args) {
        String testString1 = "  Hello   World, Java   Programmer! ";
        String testString2 = "NoSpacesHere";
        String testString3 = "     ";

        System.out.println(removeSpaces(testString1));
        System.out.println(removeSpaces(testString2));
        System.out.println(removeSpaces(testString3));
    }
}