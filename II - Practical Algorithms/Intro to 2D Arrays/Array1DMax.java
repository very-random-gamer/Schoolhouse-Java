public class Array1DMax {

    public static int max(int[] nums) {
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] nums = {3, 17, 9, 4};
        System.out.println(max(nums));
    }
}
