public class withoutEnd {
    public static String method1(String str) {
        
        // Given a string, return a version without the first and last char, 
        // so "Hello" yields "ell". The string length will be at least 2.
        
        String alpha = str.substring(1, str.length() - 1);

        return alpha; 
    }

    public static void main(String[] args) {
        System.out.println(method1("Hello")); //→ "ell"
        System.out.println(method1("java")); // → "av"
        System.out.println(method1("coding")); // → "odin"
    }
}