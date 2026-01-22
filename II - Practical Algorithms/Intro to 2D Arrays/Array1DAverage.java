public class Array1DAverage {

    public static double average(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double alpha = nums.length;
        double average = sum / alpha;
        return average;
    }

    public static void main(String[] args) {
        int[] values = {80, 90, 100};
        System.out.println(average(values));
        int[] values2 = {45, 90, 105};
        System.out.println(average(values2));
    }
}
