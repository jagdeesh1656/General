import java.util.*;

class Permutations
{

	public static void main(String args[])
	{
		// permutations("abcde");
		List<String> results = new ArrayList<String>();
		permutationsAnother("ab", results);

		for (String s : results)
			System.out.println(s);
	}

	public static List<String> permutationsAnother(String str, List<String> results)
	{
		if (str.length() == 1)
		{
			results.add(str);
			return results;
		}

		else if (str.length() == 2)
		{
			results.add(str.charAt(0) + "" + str.charAt(1));
			results.add(str.charAt(1) + "" + str.charAt(0));
			return results;
		}
		else
		{
			String remaining = str.substring(0, str.length() - 1);
			List<String> permutations = permutationsAnother(remaining, results);
			List<String> partialResults = new ArrayList<String>();
			for (String permutation : permutations)
			{
				for (int i = 0; i < permutation.length(); i ++)
				{
					partialResults.add(permutation.substring(0, i) + str.charAt(str.length() - 1) + permutation.substring(i, permutation.length()));
				}
				partialResults.add(permutation + str.charAt(str.length() - 1));
			}

			for (String result : partialResults)
				results.add(result);

			return results;
		}
	}

	public static void permutations(String str)
	{

		permutation(str, "");
	}

	public static void permutation(String str, String prefix)
	{

		if(str.length() == 0)
		{
			System.out.println(prefix);
			return;
		}

		for(int i = 0; i < str.length(); i ++)
		{

			String remaining = str.substring(0, i) + str.substring(i + 1, str.length());
			permutation(remaining, prefix + str.charAt(i));
		}
	}
}