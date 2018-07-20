package constructbintree;

import datastructure.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }
        return dfs(preorder,inorder,0,preorder.length - 1,0);
    }
    private TreeNode dfs(int[] preorder, int[] inorder, int instart, int inend,int prestart){

        if(prestart > preorder.length || instart > inend){
            return null;
        }
        TreeNode res = new TreeNode(preorder[prestart]);

        int mid = 0;
        for(int i = instart; i <= inend; i++){
            if(inorder[i] == preorder[prestart]){
                mid = i;
            }
        }
        res.left = dfs(preorder,inorder,instart,mid - 1,prestart + 1);
        res.right = dfs(preorder,inorder,mid + 1,inend,prestart + mid - instart + 1);
        return res;
    }
}
