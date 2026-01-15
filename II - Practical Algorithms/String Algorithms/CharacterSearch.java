public class CharacterSearch {

    public static boolean containsChar(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsChar("computer", 'p'));
        System.out.println(containsChar("computer", 'z'));
    }
}
