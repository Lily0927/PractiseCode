package leetcodeEasy;

public class SameTree {
	// Given two binary trees, write a function to check if they are equal or
	// not.
	//
	// Two binary trees are considered equal if they are structurally identical
	// and the nodes have the same value.
	public boolean isSameTree(TreeNode p, TreeNode q) {
		return dfs(p,q);
		
	}
	public boolean dfs(TreeNode p, TreeNode q){
		if(p==null&&q==null){
			return true;
		}
		if((p!=null &&q==null) ||(p==null&&q!=null)){
			return false;
		}
		return p.val==q.val&& dfs(p.left,q.left)&& dfs(p.right,q.right);
	}
}
