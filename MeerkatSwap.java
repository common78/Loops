import java.util.Arrays;

public class MeerkatSwap {
    public static String[] fixTheMeerkat(String[] arr) {
        if (arr.length != 3) {
            throw new IllegalArgumentException("Invalid array length. Expected length: 3");
        }

        String[] reversedArr = new String[3];
        reversedArr[0] = arr[2];
        reversedArr[1] = arr[1];
        reversedArr[2] = arr[0];

        return reversedArr;
    }

    public static void main(String[] args) {
        String[] meerkat = {"tail", "body", "head"};
        String[] fixedMeerkat = fixTheMeerkat(meerkat);
        System.out.println(Arrays.toString(fixedMeerkat));
    }
}
