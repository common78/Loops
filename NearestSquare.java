public class NearestSquare {
    public static int nearestSq(int n) {
        int sqrt = (int) Math.sqrt(n);
        int square1 = sqrt * sqrt;
        int square2 = (sqrt + 1) * (sqrt + 1);

        if (Math.abs(n - square1) <= Math.abs(n - square2)) {
            return square1;
        } else {
            return square2;
        }
    }

    public static void main(String[] args) {
        int n = 111;
        int nearestSquare = nearestSq(n);
        System.out.println(nearestSquare);
    }
}
