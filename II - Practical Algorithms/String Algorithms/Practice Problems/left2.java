public class left2 {
    public static String method1(String str) {
        // Given a string, return a "rotated left 2" version 
        // where the first 2 chars are moved to the end. 
        // The string length will be at least 2.
        String firstTwo = str.substring(0, 2);
        String other = str.substring(2, str.length());
        return other + firstTwo;
    }
    public static void main(String[] args) {
        System.out.println(method1("Hello")); // --> "lloHe"
        System.out.println(method1("code")); // --> "deco"
        System.out.println(method1("bricks")); // --> "icksbr"
    }
  
}