import java.util.*;
import java.lang.Math.*;

public class EverythingAboutPrimesAndFactors
{

	public static void main(String args[])
	{

		SieveOfEratosthenes(10001);

	}

	private static void SieveOfEratosthenes(int max)
	{

		boolean[] integers = new boolean[max];

		for(int p=2; p < Math.sqrt(max); p++)
		{
			if (!integers[p])
			{
				// for(int i=p*p; i<n; i+=p)
				for(int i = 2*p; i <max ; i+=p)
				{
					integers[i] = true;
				}
			}
		}

		for(int i = 0;i<integers.length;i++)
		{
			if (!integers[i] && (i != 0) && (i != 1))
			{

				System.out.println(i);
			}
		}
	}
}