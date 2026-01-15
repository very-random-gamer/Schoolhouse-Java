public class RandomRange {

    public static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        System.out.println(randomInt(1, 6));  // Dice
    }
}
