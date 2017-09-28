public class LinkedListForDepthsOfTree
{
	List<LinkedList<BinaryTreeNode>> createLinkedLists(BinaryTreeNode root)
	{
		List<LinkedList<BinaryTreeNode>> results = new ArrayList<LinkedList<BinaryTreeNode>>();
		LinkedList<BinaryTreeNode> currentLevel;

		if (root != null)
		{
			currentLevel = new LinkedList<BinaryTreeNode>();
			currentLevel.add(root);
		}

		

		while (currentLevel.size() > 0)
		{
			results.add(currentLevel);

			LinkedList<BinaryTreeNode> parents = currentLevel;
			currentLevel = new LinkedList<BinaryTreeNode>();

			for (BinaryTreeNode parent : parents)
			{
				if (parent.left != null)
					currentLevel.add(parent.left);
				if (parent.right != null)
					currentLevel.add(parent.right);
			}
		}

	}
}