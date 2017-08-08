import java.util.*;

public class FindMostPurchasedInContinuousStream
{
	public static void main(String args[])
	{
		String max_purchased = null;
		int numberOfPurchases = 0;
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] streamOfStrings = new String[] {"Santoor", "Kindle", "Kindle", "Lux", "Santoor", "Kindle", "Lux"};
		max_purchased = streamOfStrings[0];

		for (String string : streamOfStrings)
		{
			if (hashMap.containsKey(string))
			{
				// duplicate string

				hashMap.put(string, hashMap.get(string) + 1);

				if (hashMap.get(string) > numberOfPurchases)
				{
					max_purchased = string;
					numberOfPurchases = hashMap.get(string);
				}
			}
			else
			{
				// new string

				hashMap.put(string, 1);
			}
		}

		System.out.println(max_purchased + ": " + numberOfPurchases);
		System.out.println(hashMap);
	}
}