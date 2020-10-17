package datastructure;


/**
 * 
 * @author Marcel
 * Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. 
 * Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
 */
public class SearchBinaryTree {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
            return null;
        
		if (root.val == val) 
			return root;
		
		if (root.val < val)
			return searchBST(root.right, val);
		
		if (root.val > val)
			return searchBST(root.left, val);
		
		return null;
	}
	
	public TreeNode searchBSTNoRecursion(TreeNode root, int val) {
		while (root != null) {
			if (val > root.val)
				root = root.right;
			else if (val < root.val)
				root = root.left;
			else
				return root;
		}
		return null;
	}
}
