import java.util.*;

public class KnapsackIterative
{
	public static void main(String args[])
	{
		int[] values = new int[] {3, 6, 8};
		double[] weights = new double[] {3.3, 4.7, 7.2};
		int bestValue = 0;
		double capacity = 10;
		List<String> bestChoice = new ArrayList<String>();

		String[] bits = new String[] {"000", "001", "010", "011", "100", "101", "111", "110"};

		for (int i = 0; i < Math.pow(2, 3); i ++)
		{
			int tempValue = 0;
			double tempWeight = 0.0;

			for (int k = 0; k < bits[i].length(); k ++)
			{
				if (bits[i].charAt(k) == '1')
				{
					tempValue = tempValue + values[k];
					tempWeight = tempWeight + weights[k];
				}
			}

			if ((tempValue > bestValue) && (tempWeight < capacity))
			{
				bestChoice.add(bits[i]);
			}
		}

		for (String s : bestChoice)
		{
			System.out.println(s);
		}
	}
}