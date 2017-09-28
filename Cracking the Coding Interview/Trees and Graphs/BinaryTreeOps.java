class Node
{
	int data;
	Node left;
	Node right;
	Node parent;

	Node(int value)
	{
		data = value;
		left = null;
		right = null;
		parent = null;
	}
}

class BinaryTree
{
	Node root;

	BinaryTree()
	{
		root = null;
	}

	Node getSibling(Node node)
	{
		if (node == null || node.parent == null)
			return null;

		Node parent = node.parent;
		if (parent.left == node)
			return parent.right;
		else
			return parent.left;
	}

	Node getParent(Node root, Node node)
	{
		if (node == null || node == root)
			return node;

		if (root.left == node || root.right == node)
			return root;

		if (node.data < root.data)
			return getParent(root.left, node);
		else
			return getParent(root.right, node);
	}

	int getHeight(Node root)
	{
		if (root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	Node firstCommonAncestorInBST(Node root, Node p, Node q)
	{
		Node pr = (root.data > p.data) ? root.left : root.right;
		Node qr = (root.data > q.data) ? root.left : root.right;

		if (pr != qr || p == root || q == root)
			return root;
		else
			return firstCommonAncestorInBST(pr, p, q); 
	}

	Node findCommonAncestorInBT(Node root, Node p, Node q)
	{
		if (!covers(root, p) || !covers(root, q))
		{
			return null;
		}

		return findCommonAncestorInBTHelper(root, p, q);
	}

	Node findCommonAncestorInBTHelper(Node root, Node p, Node q)
	{
		if (root == null || p == root || q == root)
			return root;

		boolean pr = covers(root.left, p);
	  	boolean qr = covers(root.right, q);

	  	if (pr == qr)
	  		return root;

	  	Node goToRoot = pr ? root.left : root.right;
	  	return findCommonAncestorInBTHelper(goToRoot, p, q);
	}

	boolean covers(Node root, Node p)
	{
		if (root == null) return false;
		if (root == p) return true;
		return covers(root.left, p) || covers(root.right, p);
	}

	int findSum(Node node)
	{
		if (node == null)
			return 0;

		return findSum(node.left) + node.data + findSum(node.right);
	}
}

public class BinaryTreeOps
{
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(60);
		tree.root.left = new Node(10);
		tree.root.right = new Node(90);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(15);
		tree.root.right.left = new Node(82);

		System.out.println(tree.findSum(tree.root));
	}
}