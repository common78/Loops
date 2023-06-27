public class PositiveSum {
    public static int sumOfPositives(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, -4, 7, 12};
        int result = sumOfPositives(numbers);
        System.out.println(result); // 20
    }
}
