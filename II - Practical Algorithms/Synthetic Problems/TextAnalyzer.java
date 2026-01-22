public class TextAnalyzer {

    public static int countVowels(String text) {
        int count = 0;
        // TODO: Count vowels in the text
        return count;
    }

    public static int countWords(String text) {
        String[] words = text.split(" ");
        // TODO: Return the number of words
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "Java algorithms are powerful";

        System.out.println("Words: " + countWords(sentence));
        System.out.println("Vowels: " + countVowels(sentence));
    }
}
