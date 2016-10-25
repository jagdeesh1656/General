import java.util.*;

class BinaryTree
{
	class Node
	{
	  int data;
	  Node left;
	  Node right;
	
	  public Node(int data)
	  {
	    this.data = data;
	    left = null;
	    right = null;
	  }
	}
	
	Node root;
	int branch;
	
	public Node addRoot(int data)
	{
		root = new Node(data);
		branch = 0;
		return root;
	}
	
	public void addNode(int data)
	{
		Node newNode = null;
		
		if (root == null)
		{
			newNode = addRoot(data);
			root = newNode;
			return;
		}
		
		newNode = new Node(data);
		Node runningNode = root;
		
		while (runningNode != null)
		{
			branch ++;
			if (runningNode.left == null)
			{
				runningNode.left = newNode;
				return;
			}
			
			else if (runningNode.right == null)
			{
				runningNode.right = newNode;
				return;
			}
			
			else
			{
				if (branch % 2 == 0)
					runningNode = runningNode.right;
				else
					runningNode = runningNode.left;
			}

		}
	}
	
	public void doInorderTraversal(Node root)
	{
		if (root == null)
			return;
		doInorderTraversal(root.left);
		System.out.println(root.data + "");
		doInorderTraversal(root.right);
	}
	
	public static void main(String args[])
	{
	
		BinaryTree bTree = new BinaryTree();
		Node root = bTree.addRoot(0);
		bTree.addNode(7);
		bTree.addNode(8);
		bTree.addNode(9);
		
		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		System.out.println(root.left.left.data);
		// bTree.doInorderTraversal(root);
	}
}