public class Queue
{

	int queue[];
	int first;
	int last;
	int capacity;

	public Queue(int setupCount)
	{

		queue = new int [setupCount];
		capacity = setupCount;
		first = -1;
		last = -1;
	}

	public void add(int data)
	{
		if (last == capacity)
			return;

		if (first == -1)
		{
			first ++;
		}


		last ++;
		queue[last] = data;
	}

	public void delete()
	{

		if (first == -1) return;

		int temp = queue[first];
		first ++;
	}

	public void printQueue()
	{

		for (int i = first; i <= last; i ++)
		{

			System.out.println(queue[i]);
		}
	}

	public boolean isEmpty()
	{

		if ((queue.length == 0) || first == -1)
			return true;
		
		return false;
	}

	// public static void main(String args[])
	// {

	// 	Queue q = new Queue(10);
	// 	q.add(20);
	// 	q.add(30);
	// 	q.add(50);

	// 	q.printQueue();
	// }
}