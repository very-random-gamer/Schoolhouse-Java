public class WarmUp {
    public static void main(String[] args) {
        int min = 5;
        int max = 10;

        double num = (int) (Math.random() * (max - min + 1) + min);
        num = Math.pow(num, 2); // num = num * num
        System.out.println(num);

        // write code that prints the square of a random integer between min and max (inclusive)
        /* reminders:
            (int) (Math.random() * (max - min + 1) + min) -- Returns random integer
            Math.pow(int a, int b) -- returns double value of a^b
         */
    }
}