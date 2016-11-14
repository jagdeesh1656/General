public class GenericQueue<GenericDataType>
{

	private Node<GenericDataType> first;
	private Node<GenericDataType> last;
	private int noOfElements;

	private class Node<GenericDataType>
	{

		private GenericDataType data;
		private Node<GenericDataType> next;
	}

	public GenericQueue()
	{

		first = null;
		last = null;
		noOfElements = 0;
	}

	public void enqueue(GenericDataType item)
	{
		Node<GenericDataType> oldLast = new Node<GenericDataType>();
		if (last != null)
			oldLast = last;
			
		Node<GenericDataType> newNode = new Node<GenericDataType>();
		newNode.data = item;
		newNode.next = null;
		
		if (first == null)
			first = last = newNode;
		else
		{
			oldLast.next = newNode;
			last = newNode;
		}

		noOfElements ++;
	}

	public GenericDataType peek()
	{

		if (first != null)
			return first.data;
		return null;
	}

	public void display()
	{
		Node<GenericDataType> temp = first;
		while (temp != null)
		{

			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public Node<GenericDataType> dequeue()
	{

		if (first == null)
			return null;

		Node<GenericDataType> outNode = new Node<GenericDataType>();
		outNode = first;

		first = first.next;
		noOfElements --;

		if (first == null)
			last = null;

		return outNode;
	}


	// public static void main(String[] args) 
	// {
		
	// 	GenericQueue<Integer> queue = new GenericQueue<Integer>();
	// 	queue.enqueue(3);
	// 	queue.enqueue(4);
	// 	queue.enqueue(5);

	// 	queue.dequeue();
		
	// 	queue.display();
	// }
}