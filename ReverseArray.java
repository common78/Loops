import java.util.Arrays;

public class ReverseArray {
    public static int[] generateReverseArray(int n) {
        int[] reverseArray = new int[n];

        for (int i = 0; i < n; i++) {
            reverseArray[i] = n - i;
        }

        return reverseArray;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] reverseNumbers = generateReverseArray(n);
        System.out.println(Arrays.toString(reverseNumbers));
    }
}
