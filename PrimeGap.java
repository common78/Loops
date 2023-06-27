import java.util.ArrayList;
import java.util.List;

public class PrimeGap {
    public static long[] gap(int g, long m, long n) {
        for (long i = m; i <= n - g; i++) {
            if (isPrime(i) && isPrime(i + g)) {
                boolean hasGap = false;
                for (long j = i + 1; j < i + g; j++) {
                    if (isPrime(j)) {
                        hasGap = true;
                        break;
                    }
                }
                if (!hasGap) {
                    return new long[]{i, i + g};
                }
            }
        }
        return null;
    }

    private static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int g1 = 2;
        long m1 = 3;
        long n1 = 50;
        long[] result1 = gap(g1, m1, n1);
        System.out.println("Gap 2 between 3 and 50: " + formatResult(result1));

        int g2 = 2;
        long m2 = 5;
        long n2 = 5;
        long[] result2 = gap(g2, m2, n2);
        System.out.println("Gap 2 between 5 and 5: " + formatResult(result2));

        int g3 = 4;
        long m3 = 130;
        long n3 = 200;
        long[] result3 = gap(g3, m3, n3);
        System.out.println("Gap 4 between 130 and 200: " + formatResult(result3));

        int g4 = 6;
        long m4 = 100;
        long n4 = 110;
        long[] result4 = gap(g4, m4, n4);
        System.out.println("Gap 6 between 100 and 110: " + formatResult(result4));
    }

    private static String formatResult(long[] result) {
        if (result == null) {
            return "nil";
        } else {
            return "[" + result[0] + ", " + result[1] + "]";
        }
    }
}
