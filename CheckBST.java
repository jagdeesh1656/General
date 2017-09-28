public class CheckBST
{
	public boolean checkBST(BinaryTreeNode root, int min, int max)
	{
		if (root == null)
			return true;

		if (root < min || root > max)
			return false;

		return (checkBST(root.left, min, root.data - 1) &&
				checkBST(root.right, root.data + 1, max))
	}
}