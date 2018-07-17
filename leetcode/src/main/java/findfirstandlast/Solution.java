package findfirstandlast;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(nums.length == 1){
            if(nums[0] == target){
                return new int[]{0,0};
            }else{
                return new int[]{-1,-1};
            }
        }

        while(start + 1 < end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                start = mid;
                end = mid;
                while(start >= 0 && nums[start] == target){
                    start--;
                }
                while(end <= nums.length - 1 && nums[end] == target){
                    end++;
                }
                return new int[]{start + 1,end - 1};
            }
            if(target < nums[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(end - start == 1){
            if(nums[start] == target && nums[end] == target){
                return new int[]{start,end};
            }
            if(nums[start] == target){
                return new int[]{start,start};
            }
            if(nums[end] == target){
                return new int[]{end,end};
            }else{
                return new int[]{-1,-1};
            }
        }
        return new int[]{-1,-1};
    }
}
