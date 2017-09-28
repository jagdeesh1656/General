public class SortedMerge
{
	static void sortMerge(int[] A, int[] B)
	{
		// instead of inserting values in the correct places
		// you can start working on the solution from the
		// back so that it would take O(B.length) time

		int indexA, indexB;
		int sumIndex;

		for (indexA = 0; indexA < A.length; indexA++)
			if (A[indexA] == 0)
				break;

		indexA = indexA - 1;
		indexB = B.length - 1;
		sumIndex = A.length - 1;
		while (indexB >= 0)
		{
			if (indexA >= 0 && A[indexA] > B[indexB])
			{
				A[sumIndex] = A[indexA];
				indexA --;
			}
			else
			{
				A[sumIndex] = B[indexB];
				indexB --;
			}

			sumIndex --;
		} 

	}

	public static void main(String[] args) {
		
		int A[] = new int[6];
		int B[] = new int[4];

		for (int i = 0; i < A.length; i ++)
		{
			A[i] = 0;
		}

		for (int i = 0; i < B.length; i++)
		{
			B[i] = 0;
		}

		A[0] = 1;
		A[1] = 243;

		B[0] = 8;
		B[1] = 99;
		B[2] = 100;
		B[3] = 911;

		sortMerge(A, B);

		for (int i = 0; i < A.length; i ++)
			System.out.println(A[i]);

	}
}