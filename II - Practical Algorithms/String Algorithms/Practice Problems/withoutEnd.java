public class withoutEnd {
    public static String method1(String str) {
        
        // Given a string, return a version without the first and last char, 
        // so "Hello" yields "ell". The string length will be at least 2.

        return ""; 
    }

    public static void main(String[] args) {
        method1("Hello"); //→ "ell"
        method1("java"); // → "av"
        method1("coding"); // → "odin"
    }
}