public class RemoveSpaces {

    public static String removeSpaces(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("hello world"));
        System.out.println(removeSpaces("a b c d"));
    }
}
