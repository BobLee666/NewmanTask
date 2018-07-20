package bintreelevelorder;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        dfs(result, root, 0);
        return result;
    }
    private void dfs(List<List<Integer>> res, TreeNode root, int level){
        if(root == null){
            return;
        }
        if(res.size()  <= level){
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        dfs(res, root.left, level + 1);
        dfs(res, root.right, level + 1);
    }
}
