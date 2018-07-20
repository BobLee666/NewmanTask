package validatebst;

import datastructure.TreeNode;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root ,null ,null);
    }
    private boolean dfs(TreeNode root, Integer max, Integer min){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min || max != null && root.val >= max){
            return false;
        }else{
            return (dfs(root.left, root.val, min) && dfs(root.right, max, root.val));
        }
    }
}
