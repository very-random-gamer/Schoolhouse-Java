public class CleanAverage {

    public static int calculateAverage(int x, int y, int z) {
        int sum = x + y + z;
        return sum / 3;
    }

    public static String getPerformance(int average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 75) {
            return "Good";
        } else {
            return "Needs Improvement";
        }
    }

    public static void main(String[] args) {
        int avg = calculateAverage(80, 90, 70);
        String result = getPerformance(avg);

        System.out.println(result);
    }
}
