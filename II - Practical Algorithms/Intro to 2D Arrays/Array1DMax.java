public class Array1DMax {

    public static int max(int[] nums) {
        // maximum value in the array
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] > nums[i]) {
                max = nums[i+1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 17, 9, 4, 34, 20, 5, 1, 67};
        System.out.println(max(nums));
    }
}
