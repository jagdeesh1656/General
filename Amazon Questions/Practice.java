import java.util.*;	

public class Practice
{

	static class GenericTreeNode<T>
	{
		T data;
		List<GenericTreeNode<T>> children;

		GenericTreeNode()
		{
			children = new ArrayList<GenericTreeNode<T>>();
		}

		GenericTreeNode(T value)
		{
			data = value;
		}

		List<GenericTreeNode<T>> getChildren()
		{
			return children;
		}

		boolean hasChildren()
		{
			return (getChildren().size() > 0);
		}

		void setChildren(List<GenericTreeNode<T>> links)
		{
			children = links;
		}

		void addChild(GenericTreeNode<T> child)
		{
			if (child != null)
				children.add(child);
		}

		void addChildAtIndex(int index, GenericTreeNode<T> child) throws IndexOutOfBoundsException
		{
			if (child != null && index > 0)
			{
				children.add(index, child);
			}
		}

		GenericTreeNode<T> getChildAtIndex(int index) throws IndexOutOfBoundsException
		{
			return children.get(index);
		}

		int getHashCode()
		{
			return data.hashCode();
		}
	}

	public class BinaryTree
	{
		class BinaryNode<T>
		{
			T data;
			BinaryNode left;
			BinaryNode right;

			BinaryNode()
			{
				left = null;
				right = null;
			}

			BinaryNode(T value)
			{
				data = value;
			}

			BinaryNode getLeftChild()
			{
				return left;
			}

			BinaryNode getRightChild()
			{
				return right;
			}

			void setChildren(BinaryNode one, BinaryNode two)
			{
				left = one;
				right = two;
			}

			void addLeftChild(BinaryNode one)
			{
				left = one;
			}

			void addRightChild(BinaryNode two)
			{
				right = two;
			}

			boolean hasLeftChild()
			{
				return (left != null);
			}

			boolean hasRightChild()
			{
				return (right != null);
			}

			boolean hasBothChildren()
			{
				return ((left != null) && (right != null));
			}

			// BinaryNode deleteLeftChild()
			// {
			// 	// this.left = lastInsertedNode;
			// }

		}


	}

	static int findSubset(int[] arr, int sum, int start, List<Integer> indices)
	{
		if (sum < 0) return -1;
		if (sum == 0) return 0;

		for (int i = start; i < arr.length; i ++)
		{
			int len = findSubset(arr, sum - arr[i], start + 1, indices);
			if (len >= 0)
				return len + 1;
		}

		return -1;
	}

	public static void main(String args[])
	{
		// HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		// hashMap.put(-9, 3);
		// hashMap.put(0, 3);
		// hashMap.put(3, 3);
		// hashMap.put(2, 3);
		// hashMap.put(1, 3);
		// hashMap.put(9, 3);
		// hashMap.put(6, 3);
		// hashMap.put(-2, 3);
		// hashMap.put(-8, 3);


		// Set<Integer> set = hashMap.keySet();

		// System.out.println(set);

		// GenericTreeNode<Integer> root = new GenericTreeNode<Integer>(1);
		// GenericTreeNode<Integer> node2 = new GenericTreeNode<Integer>(2);
		// GenericTreeNode<Integer> node3 = new GenericTreeNode<Integer>(3);
		// List<GenericTreeNode<Integer>> rootChildren = new ArrayList<GenericTreeNode<Integer>>();
		// rootChildren.add(node2);
		// rootChildren.add(node3);
		// root.setChildren(rootChildren);

		int arr[] = new int[] {1, 8, 2, 4};
		List<Integer> indices = new ArrayList<Integer>();
		int sum = 7;
		System.out.println(findSubset(arr, sum, 0, indices));



	}
}