public class DiceSimulation {

    public static int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        int[] rolls = new int[100];

        // TODO: fill array with rolls

        int sum = 0;
        int sixCount = 0;

        // TODO: traverse array to compute stats

        System.out.println("Average roll: " + (double) sum / rolls.length);
        System.out.println("Number of sixes: " + sixCount);
    }
}
