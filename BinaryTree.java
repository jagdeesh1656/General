import java.util.*;

class BinaryTree
{
	class TreeNode
	{
	  int data;
	  TreeNode left;
	  TreeNode right;
	
	  public TreeNode(int data)
	  {
	    this.data = data;
	    left = null;
	    right = null;
	  }
	}
	
	TreeNode root;
	int branch;
	
	// public Node addRoot(int data)
	// {
	// 	root = new Node(data);
	// 	branch = 0;
	// 	return root;
	// }
	
	// public void addNode(int data)
	// {
	// 	Node newNode = null;
		
	// 	if (root == null)
	// 	{
	// 		newNode = addRoot(data);
	// 		root = newNode;
	// 		return;
	// 	}
		
	// 	newNode = new Node(data);
	// 	Node runningNode = root;
		
	// 	while (runningNode != null)
	// 	{
	// 		branch ++;
	// 		if (runningNode.left == null)
	// 		{
	// 			runningNode.left = newNode;
	// 			return;
	// 		}
			
	// 		else if (runningNode.right == null)
	// 		{
	// 			runningNode.right = newNode;
	// 			return;
	// 		}
			
	// 		else
	// 		{
	// 			if (branch % 2 == 0)
	// 				runningNode = runningNode.right;
	// 			else
	// 				runningNode = runningNode.left;
	// 		}

	// 	}
	// }

	// public boolean searchNode(int data)
	// {
	// 	int branch = 0;
	// 	if (root.data == data)
	// 		return true;
		
	// 	while (root != null)
	// 	{
	// 		branch ++;
	// 		if (branch % 2 == 0)
	// 			root = root.right;
	// 		else
	// 			root = root.left;
	// 	}
		
	// 	return false;
	// }
	
	// public void doInorderTraversal(Node root)
	// {
	// 	if (root == null)
	// 		return;
	// 	doInorderTraversal(root.left);
	// 	System.out.println(root.data + "");
	// 	doInorderTraversal(root.right);
	// }

	// public void levelOrderTraversal(Node root)
	// {

	// 	if (root == null)
	// 		return;

	// 	Queue q = new Queue(20);

	// 	Node temp_node = root;
	// 	q.add(temp_node);
	// 	while (!q.isEmpty())
	// 	{

	// 		q.delete();
	// 		System.out.println(temp_node.data);
	// 		if (temp_node.left != null)
	// 			q.add(temp_node.left);
	// 		if (temp_node.right != null)
	// 			q.add(temp_node.right);
	// 	}
	// }
	
	public static void main(String args[])
	{
	
		GenericQueue<TreeNode> q = new GenericQueue<TreeNode>();
	}
}
