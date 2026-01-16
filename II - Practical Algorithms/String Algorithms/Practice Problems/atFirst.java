public class atFirst {
    public static String method1(String str) {
        
        // Given a string, return a string length 2
        // made of its first 2 chars. If the string
        // length is less than 2, use '@' for the missing chars.
        
        String alpha = "";

        if (str.length() < 1) {
            alpha = str + "@@";
        }
        else if (str.length() < 2) { // length is 100% 1
            alpha = str + "@";
        }
        else {
            alpha = str.substring(0, 2);
        }

        return alpha;
    }

    public static void main(String[] args) {
        System.out.println(method1("hello")); // → "he"
        System.out.println(method1("hi")); // → "hi"
        System.out.println(method1("h")); // → "h@"
        System.out.println(method1(""));
    }
}