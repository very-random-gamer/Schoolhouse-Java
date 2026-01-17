public class ParallelArrays {
    public static void main(String[] args) {
        String[] names = {"Alex", "Jordan", "Taylor"};
        int[] scores = {85, 92, 78};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }
}
