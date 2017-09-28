public class MinimalTree
{
	public static void main(String[] args) {
		
		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7};

		createMinimalBST(array, 0, array.length - 1);
	}

	BinaryTreeNode createMinimalBST(int[] array, int start, int end)
	{
		if (end < start)
			return null;

		int mid = (start + end) / 2;
		BinaryTreeNode root = new BinaryTreeNode(array[mid]);

		root.left = createMinimalBST(array, start, mid - 1);
		root.right = createMinimalBST(array, mid + 1, end);

		return root;
	}
}