public class DistanceInline {
    public static void main(String[] args) {
        double x1 = 3;
        double y1 = 4;
        double x2 = 7;
        double y2 = 1;

        double distance = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println(distance);
    }
}
