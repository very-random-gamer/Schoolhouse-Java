public class StringBasics {
    public static void main(String[] args) {
        String text = "Schoolhouse";

        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.substring(0, 6));
        System.out.println(text.indexOf("house"));
        System.out.println(text.equals("schoolhouse"));
    }
}
