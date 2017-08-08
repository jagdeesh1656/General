public class CheckBinaryTree
{
	public boolean checkBinTree(Node root)
	{
		if (root == null)
			return true;

		if (root.childCount() <= 2)
			return true;

		if (root.childCount > 2)
			return false;

		if (!checkBinTree(root.left))
			return false;

		if (!checkBinTree(root.right))
			return false;
	}

	public static void main(String args[])
	{

	}
}