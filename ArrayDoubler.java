import java.util.Arrays;

public class ArrayDoubler {
    public static int[] doubleValues(int[] nums) {
        int[] doubledArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            doubledArray[i] = nums[i] * 2;
        }

        return doubledArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] doubled1 = doubleValues(nums1);
        System.out.println(Arrays.toString(doubled1));

        int[] nums2 = {5, 10, 15, 20};
        int[] doubled2 = doubleValues(nums2);
        System.out.println(Arrays.toString(doubled2));
    }
}
