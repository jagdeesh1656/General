class Node
{
	int data;
	Node next;

	Node (int data)
	{
		this.data = data;
		next = null;
	}
}

class LinkedList
{
	Node head = null;
	Node tail = null;
	int length;

	public void addNode(int data)
	{
		Node node = new Node(data);
		if (head == null)
		{
			head = node;
			tail = node;
		}

		else
		{
			addNodeToEnd(node);
		}

		length = length + 1;
	}

	public void addNodeToEnd(Node node)
	{
		if (node != null)
		{
			tail.next = node;
			tail = node;
		}
	}

	public void printList()
	{
		Node node = head;
		while (head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}

	public void partition()
	{
		if (length <= 2)
		{
			return;
		}

		int counter = 3;
		Node start = head;
		Node partition = head.next;
		Node tempNode = partition;
		Node node = partition.next;

		while (node != null)
		{
			if (counter % 2 != 0)
			{
				start.next = node;
				start = node;
			}
			else
			{
				partition.next = node;
				partition = node;
			}

			counter = counter + 1;
			node = node.next;
		}

		tail = partition;

		if (start.next == null)
		{
			partition.next = null;
		}

		start.next = tempNode;
	}
}

public class OddEvenListPartition
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();

		list.addNode(9);
		// list.addNode(7);
		list.addNode(1);
		list.addNode(0);
		list.addNode(1);
		list.addNode(12);
		list.addNode(34);
		// list.addNode(-5);
		// list.addNode(3);

		list.partition();
		list.printList();
	}
}
