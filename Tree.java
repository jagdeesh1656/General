class Node
{
	
	int data;
	Node left;
	Node right;
}

class Tree
{
	
	Node root;

	insertLeft(Node node)
	{

		if (this.left != NULL)
		{

			this.left = node;
		}
		else
			return;
	}

	insert (Node node)
	{

		if (root == null)
		{

			root = node;
		}

		while(root != NULL)
		{

			if (node.data > root.data)
				root = root.right;
			else
				root = root.left;
		}

		root.right = node;
	}
}

void main(String args[])
{
	

}