package threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int len = nums.length;
        if(len <= 0) {
            return ret;
        }
        Arrays.sort(nums);
        for(int i = 0;i <= len - 3;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int start = i + 1;
            int end = len - 1;
            while(start < end){
                if(nums[start] + nums[end] + nums[i] < 0){
                    start++;
                }else if(nums[start] + nums[end] + nums[i] > 0){
                    end--;
                }else{
                    List tmp = new ArrayList<List<Integer>>();
                    tmp.add(nums[start]);
                    tmp.add(nums[end]);
                    tmp.add(nums[i]);
                    ret.add(tmp);
                    while(start < end && nums[start] == nums[start+1]){
                        start++;
                    }
                    start++;
                    while(start < end && nums[end] == nums[end-1]){
                        end--;
                    }
                    end--;
                }
            }
        }
        return ret;
    }
}
