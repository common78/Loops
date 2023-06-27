public class ArrayProduct {
    public static int multiplyValues(int[] array) {
        int product = 1;

        for (int value : array) {
            product *= value;
        }

        return product;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int result = multiplyValues(array);
        System.out.println(result);
    }
}
