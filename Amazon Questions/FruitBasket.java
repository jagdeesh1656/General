import java.util.*;
import java.util.regex.*;

public class FruitBasket
{
	public static int checkWinner(List<List<String>> codeList, List<String> shoppingCart)
	{
		HashSet<String> priceSet = new HashSet<String>();
		HashMap<String, List<String>> priceMap = new HashMap<String, List<String>>();
		List<String> shoppingCartSimplified = new ArrayList<String>();
		List<String> codeListSimplified = new ArrayList<String>();
		List<Integer> counts = new ArrayList<Integer>();

		for (List<String> list : codeList)
		{
			counts.add(list.size());
			String combined = "";
			for (String secretItem : list)
			{
				priceSet.add(secretItem);
				combined += secretItem;
			}

			codeListSimplified.add(combined);
		}

		int minCount = Collections.min(counts);

		for (int i = 0; i < shoppingCart.size(); i ++)
		{
			if (priceSet.contains(shoppingCart.get(i)))
				shoppingCartSimplified.add(shoppingCart.get(i));
		}

		if (shoppingCartSimplified.size() < minCount)
			return 0;

		else
		{
			for (Integer count : counts)
			{
				for (int k = 0; k < shoppingCartSimplified.size(); k += count)
				{
					String comb = "";
					for (int i = k; i < count; i++)
						comb += shoppingCartSimplified.get(i);

					if (codeListSimplified.contains(comb))
						return 1;
				}
			}
		}

		return 0;
	}

	public static int checkWinner2(List<List<String>> codeList, List<String> shoppingCart)
	{
		HashSet<String> priceSet = new HashSet<String>();
		List<String> shoppingCartSimplified = new ArrayList<String>();
		List<Integer> counts = new ArrayList<Integer>();

		for (List<String> list : codeList)
		{
			counts.add(list.size());
			for (String secretItem : list)
			{
				priceSet.add(secretItem);
			}
		}

		int minCount = Collections.min(counts);

		for (int i = 0; i < shoppingCart.size(); i ++)
		{
			if (priceSet.contains(shoppingCart.get(i)))
				shoppingCartSimplified.add(shoppingCart.get(i));
		}

		if (shoppingCartSimplified.size() < minCount)
			return 0;

		int lastIndex = 0;
		int secretItemCount = 0;
		int count = 0;

		while (codeList.size() > 0)
		{
			String combinedItems = "";
			String shoppedItems = "";

			for (String item : list)
			{
				if (item.equals("something"))
					combinedItems += ".*";
				else
					combinedItems += item;
			}

			for (int i = lastIndex; i < lastIndex + list.size(); i++)
			{
				shoppedItems += shoppingCart.get(i);
			}

			if (combinedItems.equals(shoppedItems) || combinedItems.matches(shoppedItems))
			{
				secretItemCount += 1;
				lastIndex = lastIndex + list.size();
				codeList.remove(count);
				count ++;

				if (lastIndex >= shoppingCart.size())
					break;
			}
			else
			{
				lastIndex = lastIndex + 1;
			}
		}

		if (secretItemCount == codeList.size())
		{
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		
		List<List<String>> codeList = new ArrayList<List<String>>();

		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("apple");

		List<String> list2 = new ArrayList<String>();
		list2.add("banana");
		list2.add("something");
		list2.add("banana");

		codeList.add(list1);
		codeList.add(list2);

		List<String> shoppingCart = new ArrayList<String>();
		shoppingCart.add("apple");
		shoppingCart.add("apple");
		shoppingCart.add("orange");
		shoppingCart.add("pear");
		shoppingCart.add("orange");
		shoppingCart.add("banana");
		shoppingCart.add("banana");
		shoppingCart.add("banana");

		System.out.println(checkWinner2(codeList, shoppingCart));


	}
}