public class MessyAverage {
    public static void main(String[] args) {
        int a = 80;
        int b = 90;
        int c = 70;

        int sum = 0;
        sum = sum + a;
        sum = sum + b;
        sum = sum + c;

        int avg = sum / 3;

        if (avg >= 90) {
            System.out.println("Excellent");
        } else if (avg >= 75) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}
