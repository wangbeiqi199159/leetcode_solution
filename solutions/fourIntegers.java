/**
 * Created by becky on 9/7/17.
 */
import java.util.Arrays;

public class fourIntegers {
    public static int[] fourIntegers(int A, int B, int C, int D)
    {
        int[] nums = new int[]{A, B, C, D};
        Arrays.sort(nums);
        swap(nums, 0, 1);
        swap(nums, 2, 3);
        swap(nums, 0, 3);
        return nums;
    }
    private static void swap(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = fourIntegers(1, 3, 2, 4);
        for(int i: nums) System.out.print(i + " ");
    }

}