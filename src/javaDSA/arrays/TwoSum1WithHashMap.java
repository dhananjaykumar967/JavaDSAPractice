package javaDSA.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1WithHashMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum1WithHashMap().twoSum(new int[]{3,3}, 6)));
    }

    /**
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     */

    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 2) {
            return new int[]{0, 1};
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int resultCompletion = target - nums[i];
            if (map.containsKey(resultCompletion)) {
                return new int[]{map.get(resultCompletion), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{0, 0};
    }
}
