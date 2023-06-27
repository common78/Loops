import java.util.Arrays;

public class AverageCalculator {
    public static int calculateAverage(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int count = nums.length;
        int average = sum / count;
        return average;
    }

    public static void main(String[] args) {
        int[] nums1 = {85, 90, 92, 88, 95};
        System.out.println(calculateAverage(nums1));

        int[] nums2 = {75, 80, 82, 78, 85};
        System.out.println(calculateAverage(nums2));
    }
}
