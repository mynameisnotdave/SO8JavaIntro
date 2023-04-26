import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums;
        runningSum(nums= new int[]{3, 2, 7, 14, 5});
    }
    @Contract("_ -> param1")
    public static int @NotNull [] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i=1; i< nums.length; i++) {
            nums[i] = nums[i] + nums[i-1]; // nums[0]+nums[1]
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}