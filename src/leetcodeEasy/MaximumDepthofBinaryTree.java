package leetcodeEasy;

public class MaximumDepthofBinaryTree {
	// Given a binary tree, find its maximum depth.
	//
	// The maximum depth is the number of nodes along the longest path from the
	// root node down to the farthest leaf node.
	private int max;
	public int maxDepth(TreeNode root) {
		return dfs(root);

	}
	public int dfs(TreeNode root){
		if(root==null){
			return 0;
		}
		return max=Math.max(dfs(root.left), dfs(root.right))+1;
	}
}
