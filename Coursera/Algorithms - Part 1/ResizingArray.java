public class ResizingArray
{
	int[] array;
	int capacity;
	int length;

	ResizingArray()
	{
		array = new int[2];
		capacity = 2;
		length = 0;
	}

	public void add(int element)
	{
		if (length + 1 == capacity)
			resize(capacity * 2);

		array[length] = element;
		length ++;
	}

	public void remove(int element)
	{
		if (length == capacity / 4)
			resize (capacity / 2);

		array[length] = 0;
		length --;
	}

	public void resize(int newCapacity)
	{
		int[] newArray = new int[newCapacity];
		for (int i = 0; i < length; i ++)
			newArray[i] = array[i];

		array = newArray;
		capacity = newCapacity;
	}

	public void print()
	{
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public static void main(String[] args) {
		
		ResizingArray resizableArray = new ResizingArray();
		resizableArray.add(1);
		resizableArray.add(2);
		resizableArray.add(3);
		// resizableArray.add(4);
		// resizableArray.add(5);

		resizableArray.print();
	}
}