package datastructure;

/**
 * @Author Marcel
 * 
 * Given a non-empty binary tree, find the maximum path sum.
 * For this problem, a path is defined as any node sequence from some starting node to any node in the tree 
 * along the parent-child connections. The path must contain at least one node and does not need to go through the root.
 */

public class BinTreeMaxSumPath {
    
	static int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
    	maxSum = Integer.MIN_VALUE;
    	dfs(root);
        return maxSum;
    }

    static int dfs(TreeNode parent) {

        if (parent == null){
            return 0;
        }
                
        int maxL = dfs(parent.left);
        int maxR = dfs(parent.right);

        int max1 = Math.max(Math.max(maxL, maxR) + parent.val, parent.val);
        int max2 = Math.max(max1, maxL+maxR+parent.val); 

        maxSum = Math.max(maxSum, Math.max(max1, max2));
        System.out.println("Parent.val [" + parent.val + "] max1 [" + max1 + "] max2 [" + max2 + "] maxSum ["+ maxSum + "]");
        return max1;
 
    }
}
