public class Array1DSearch {

    public static boolean contains(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] data = {4, 6, 8, 10};
        System.out.println(contains(data, 8));
        System.out.println(contains(data, 3));
    }
}
