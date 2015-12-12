package leetcodeEasy;

public class InvertBinaryTree {
	// Invert a binary tree.
	//
	// 4
	// / \
	// 2 7
	// / \ / \
	// 1 3 6 9
	// to
	// 4
	// / \
	// 7 2
	// / \ / \
	// 9 6 3 1
	public TreeNode invertTree(TreeNode root) {
		return dfs(root);
	}
	public TreeNode dfs(TreeNode root){
		if(root==null){
			return null;
		}
		TreeNode temp=root.left;
		root.left=dfs(root.right);
		root.right=dfs(temp);
		return root;
	}

}
