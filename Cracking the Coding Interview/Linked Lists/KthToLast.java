public class KthToLast
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();

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

		int k = 8;

		int value = list.kthToLast(k);
		System.out.println(value);
	}
}