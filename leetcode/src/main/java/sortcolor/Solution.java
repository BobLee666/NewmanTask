package sortcolor;

class Solution {
    public void sortColors(int[] nums) {
        int[] record = {0,0,0};
        for(int i = 0; i < nums.length; i++){
            record[nums[i]]++;
        }
        for(int i = 0; i < record[0]; i++){
            nums[i] = 0;
        }
        for(int i = record[0]; i < record[0] + record[1]; i++){
            nums[i] = 1;
        }
        for(int i = nums.length - 1; i >= record[0] + record[1]; i--){
            nums[i] = 2;
        }
    }
}