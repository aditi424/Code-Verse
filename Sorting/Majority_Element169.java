import java.util.*;

class Majority_Element169 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int m = n/2, c=1;

        if(n==1){
            return nums[0];
        }

        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1])c++;
            if(c>m)return nums[i];
        }
        return -1;

    }
} 