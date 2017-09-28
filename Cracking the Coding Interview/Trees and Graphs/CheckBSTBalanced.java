class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree
{
	Node root;

	BinaryTree()
	{
		root = null;
	}


	boolean isBalanced(Node root)
	{
		if (root == null)
			return true;

		int height = getHeight(root.left) - getHeight(root.right);
		if (Math.abs(height) > 1)
			return false;
		else
			return isBalanced(root.left) && isBalanced(root.right);
	}

	int getHeight(Node node)
	{
		if (node == null)
			return -1;
		return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
	}

	int checkHeight(Node root)
	{
		if (root == null)
			return -1;

		int leftHeight = checkHeight(root.left);
		if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

		int rightHeight = checkHeight(root.right);
		if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		int height = Math.abs(leftHeight - rightHeight);
		if (height > 1)
			return Integer.MIN_VALUE;
		else
			return Math.max(checkHeight(root.left), checkHeight(root.right)) + 1;
	}

	boolean isBalancedSimple(Node root)
	{
		return root != Integer.MIN_VALUE;
	}
}

public class CheckBSTBalanced
{
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		// tree.root.right.left.left = new Node(7);

		System.out.println(tree.isBalanced(tree.root));
	}
}