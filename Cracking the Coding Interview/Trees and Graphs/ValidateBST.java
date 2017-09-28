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

	boolean isValidBSTree(Node root, int min, int max)
	{
		if (root == null)
			return true;

		if (root.key < min || root.key > max)
			return false;

		return isValidBSTree(root.left, min, root.key - 1) && 
			   isValidBSTree(root.right, root.key + 1, max);
	}

}
public class ValidateBST
{

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(60);
		tree.root.left = new Node(10);
		tree.root.right = new Node(90);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(15);
		tree.root.right.left = new Node(82);

		System.out.println(tree.isValidBSTree(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));

		// We can also do an in-order traversal of the BinaryTree and check to see if they are in sorted order
		// If they are, it is a BST!
		// Extra space is not needed if we just check the integer being printed is less than the last integer printed
		
	}
}