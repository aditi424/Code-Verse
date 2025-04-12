import java.util.*;

class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            int complement = target - nums[i];
            
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
