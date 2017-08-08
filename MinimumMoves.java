public class MinimumMoves
{
	public static void main(String args[])
	{
		int[] a = new int[] {1234, 4321};
		int[] m = new int[] {2345, 3214};
		int j = 0;
		for (int k = 0; k < a.length; k++)
		{
			while(a[k]>0 && m[k]>0)
			{
				sum = sum + Math.abs(a[k]%10 - m[k]%10)
				a[k] = a[k]/10;
				m[k] = m[k]/10;
			}
		}
		// for (int i = 0; i < a.length; i++)
		// {
		// 	System.out.println(Math.abs(a[i] - m[j]));
		// 	j ++;
		// }
	}
}