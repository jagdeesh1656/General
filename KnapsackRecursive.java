public class KnapsackRecursive
{
	public static void main(String args[])
	{
		int[] values = new int[] {3, 6, 9};
		int[] weights = new int[] {3, 0, 7};
		int bestValue = 0;
		int capacity = 10;

		int[][] table = new int[4][11];

		for(int i = 0; i <= 3; i++)
		{
			for(int j = 0; j <= 10; j++)
			{
					if (i==0 || j==0)
                  		table[i][j] = 0;
					else if (j < weights[i-1])
						table[i][j] = table[i - 1][j];
					else
						table[i][j] = Math.max(values[i-1] + table[i-1][j-weights[i-1]], table[i-1][j]);
				
			}
		}

		for (int i = 1; i <= 3; i ++)
		{
			System.out.print(i + " ");
			for (int j = 0; j <= 10; j ++)
			{
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
}