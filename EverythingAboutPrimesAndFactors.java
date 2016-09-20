import java.util.*;
import java.lang.Math.*;

public class EverythingAboutPrimesAndFactors
{

	public static void main(String args[])
	{

		SieveOfEratosthenes();

	}

	private static void SieveOfEratosthenes()
	{

		int n = 10001;

		boolean[] integers = new boolean[n];

		for(int p=2; p < Math.sqrt(n); p++)
		{
			if (!integers[p])
			{
				// for(int i=p*p; i<n; i+=p)
				for(int i = 2*p; i <n ; i+=p)
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