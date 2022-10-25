// Given the root of a binary tree, return its maximum depth.

// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

class Solution {
    public int maxDepth(TreeNode root) {
        int count = 1;
        if(root == null){
            return 0;
        }
        //recursive call to add up the roots on each side
        //go as far left as possible
        int left = maxDepth(root.left);
        //go as far right as possible
        int right = maxDepth(root.right);
        
        //return the bigger of the two plus 1 because the depth of the tree will start at 1
        return Math.max(left,right) + 1;
        
    }
}
