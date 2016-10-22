void MergeSort (int[] array)
{

	int[] helper = new int[array.length];
	mergesort(array, helper, 0 , array.length);
}

void mergesort(int array[], int helper[], int low, int high)
{

	if (low < high)
	{

		middle = (low + high) / 2
		mergesort(array, helper, low, middle);
		mergesort(array, helper, middle + 1, high);
		merge(array, helper, low, middle, high);
	}

}

void merge(int[] array, int[] helper, int low, int middle, int high)
{

	for(i=0;i<array.length;i++)
	{

		helper[i] = array[i];
	}

	int left = low;
	int current = low;
	int right = middle + 1;

	while (left <= middle && right <= high)
	{

		if (helper[left] < helper[right])
		{
			array[current] = helper[left]
			left ++;
		}
		else
		{
			array[current] = helper[right]
			right ++;
		}

		current ++;
	}

	for(int i = 0; i < middle - left; i ++)
	{

		array[current + i] = helper[left + i];
	}
}