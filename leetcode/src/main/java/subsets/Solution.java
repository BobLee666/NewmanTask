package subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        List<Integer> inner = new ArrayList<Integer>();
        backTracking(outer, inner, nums, 0);
        return outer;
    }
    private void backTracking(List<List<Integer>> outer, List<Integer> inner, int[] nums, int start){
        outer.add(inner);
        for(int i = start; i < nums.length; i++){
            inner.add(nums[i]);
            backTracking(outer, inner, nums, i + 1);
            inner.remove(inner.size() - 1);
        }
    }
}
