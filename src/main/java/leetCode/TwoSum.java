package leetCode;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Short, Short> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            short searchingNumber = (short) (target - nums[i]);
            if (hashMap.containsKey(searchingNumber)) {
                return new int[]{hashMap.get(searchingNumber), i};
            } else {
                hashMap.put((short)nums[i], (short) i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
