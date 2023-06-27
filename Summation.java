public class Summation {
    public static int summation(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int sum1 = summation(num1);
        System.out.println(sum1);

        int num2 = 8;
        int sum2 = summation(num2);
        System.out.println(sum2);
    }
}
