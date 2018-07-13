package maximumsubarray;

/**
 * Created by Asus_User on 2018/7/13.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int acc = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            acc = Math.max(acc,0);
            acc = acc + nums[i];
            max = Math.max(acc,max);
        }
        return max;
    }
}
