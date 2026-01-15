public class ReuseDemo {
    public static void main(String[] args) {
        System.out.println(getPerformance(calculateAverage(100, 95, 98)));
        System.out.println(getPerformance(calculateAverage(70, 75, 72)));
        System.out.println(getPerformance(calculateAverage(85, 80, 90)));
    }

    public static int calculateAverage(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static String getPerformance(int average) {
        if (average >= 90) return "Excellent";
        if (average >= 75) return "Good";
        return "Needs Improvement";
    }
}
