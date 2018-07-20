package bintreeinorder;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        travel(root, res);
        return res;
    }
    private void travel(TreeNode root, List<Integer> res){
        if(root != null){
            if(root.left != null){
                travel(root.left, res);
            }
            res.add(root.val);
            if(root.right != null){
                travel(root.right, res);
            }
        }
    }
}
