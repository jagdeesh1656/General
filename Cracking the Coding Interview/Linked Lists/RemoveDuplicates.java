import java.util.Hashtable;

public class RemoveDuplicates
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();

		list.addNode(1);
		list.addNode(0);
		list.addNode(1);
		list.addNode(1);
		list.addNode(1);
		list.addNode(1);
		list.addNode(3);
		list.addNode(1);
		list.addNode(1);
		list.addNode(6);
		list.addNode(1);
		list.addNode(8);
		list.addNode(3);

		list.printLinkedList();
		list.removeDuplicatesFromUnsortedList(table);
		System.out.println("\n");
		list.printLinkedList();
	}
}