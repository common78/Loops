public class StringRepeater {
    public static String repeatString(int n, String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int n1 = 6;
        String s1 = "I";
        System.out.println(repeatString(n1, s1));

        int n2 = 5;
        String s2 = "Hello";
        System.out.println(repeatString(n2, s2));
    }
}
