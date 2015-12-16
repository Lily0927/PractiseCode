package leetcodeMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class BinaryTreeInorderTraversal {
//	Given a binary tree, return the inorder traversal of its nodes' values.
//
//			For example:
//			Given binary tree {1,#,2,3},
//			   1
//			    \
//			     2
//			    /
//			   3
//			return [1,3,2].
//
//			Note: Recursive solution is trivial, could you do it iteratively?
	List<Integer> result=new ArrayList<Integer>();
public List<Integer> inorderTraversal(TreeNode root) {

		if (root == null) {
			return result;
		}
		inorderTraversal(root.left);
		result.add(root.val);
		inorderTraversal(root.right);
		return result;       
    }
public List<Integer> inorderTraversal2(TreeNode root) {
	Stack temp=new Stack();
	List<Integer> a=new ArrayList<Integer>();
	if(root==null){
		return a;
	}
	temp.push(root);
	while(!temp.isEmpty()){
		Object temp2=temp.pop();
		if(temp2==null){
			continue;
		}
		if(temp2 instanceof Integer){
			a.add((Integer)temp2);
		}else{
			
			temp.push(((TreeNode)temp2).right);
			temp.push(((TreeNode)temp2).val);
			temp.push(((TreeNode)temp2).left);
		}
	}
	return a;
}

}
