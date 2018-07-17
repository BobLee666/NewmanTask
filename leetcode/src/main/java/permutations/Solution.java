package permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        backTracking(outer, new ArrayList<Integer>(), nums);
        return outer;
    }
    private void backTracking(List<List<Integer>> outer, List<Integer> inner, int[] nums){
        if(inner.size() == nums.length){
            outer.add(new ArrayList<Integer>(inner));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(inner.contains(nums[i])){
                    continue;
                }
                inner.add(nums[i]);
                backTracking(outer, inner, nums);
                inner.remove(inner.size() - 1);
            }
        }
    }
}
