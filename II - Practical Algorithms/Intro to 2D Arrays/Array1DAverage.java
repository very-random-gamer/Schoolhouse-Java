public class Array1DAverage {

    public static double average(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return (double) total / nums.length;
    }

    public static void main(String[] args) {
        int[] values = {80, 90, 100};
        System.out.println(average(values));
    }
}
