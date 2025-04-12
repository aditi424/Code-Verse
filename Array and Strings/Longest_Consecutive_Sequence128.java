import java.util.*;

public class Longest_Consecutive_Sequence128 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int res = 0;
        
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int curr = num;
                int cnt = 1;
                
                while (numSet.contains(curr + 1)) {
                    curr++;
                    cnt++;
                }
                
                res = Math.max(res, cnt);
            }
        }
        
        return res;
    }
}
