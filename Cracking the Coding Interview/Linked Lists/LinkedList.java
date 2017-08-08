import java.util.Hashtable;

public class LinkedList
{
	class Node
	{
		int data;
		Node next = null;

		Node(int value)
		{
			data = value;
		}
	}

	Node head;
	int linkedListLength = 0;

	LinkedList()
	{
		head = null;
	}

	public void addNode(int value)
	{
		Node node = new Node(value);

		if (head == null)
		{
			head = node;
			return;
		}

		Node temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
			linkedListLength ++;
		}

		temp.next = node;
		linkedListLength ++;
	}

	public int getLinkedListLength()
	{
		return linkedListLength;
	}

	public void printLinkedList()
	{
		if (head == null)
		{
			System.out.println("Nothing to print");
			return;
		}

		Node temp = head;
		while (temp != null)
		{
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public void removeDuplicatesFromUnsortedList(Hashtable table)
	{
		Node node = head;
		Node previous = null;

		while (node != null)
		{
			if (table.containsKey(node.data))
			{
				previous.next = node.next;
			}
			else
			{
				table.put(node.data, 0);
				previous = node;
			}

			node = node.next;
		}
	}

	public int kthToLast(int k)
	{
		Node p1 = head;
		Node p2 = head;

		for (int i = 0; i < k; i ++)
		{
			if (p1 == null)
				System.out.println("No head!");

			p1 = p1.next;
		}

		while (p1 != null)
		{
			p2 = p2.next;
			p1 = p1.next;
		}

		return p2.data;
	}

}