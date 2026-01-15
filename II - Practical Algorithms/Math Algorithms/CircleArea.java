public class CircleArea {

    public static double area(double radius) {
        double raw = Math.PI * Math.pow(radius, 2);
        return roundToTwo(raw);
    }

    public static double roundToTwo(double num) {
        return Math.round(num * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(2.75));
    }
}
