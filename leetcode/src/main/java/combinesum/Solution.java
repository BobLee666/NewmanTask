package combinesum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        backTracking(outer, new ArrayList<Integer>(), candidates, target, 0);
        return outer;
    }
    private void backTracking(List<List<Integer>> outer,List<Integer> inner,int[] cand, int target, int start){
        if(target < 0){
            return;
        }
        if(target == 0){
            outer.add(new ArrayList<Integer>(inner));
        }else{
            for(int i = start; i < cand.length; i++){
                inner.add(cand[i]);
                backTracking(outer, inner, cand, target - cand[i], i);
                inner.remove(inner.size() - 1);
            }
        }
    }
}
