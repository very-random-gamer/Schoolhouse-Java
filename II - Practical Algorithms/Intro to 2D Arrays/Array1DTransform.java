public class Array1DTransform {

    public static void doubleValues(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        doubleValues(nums);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
