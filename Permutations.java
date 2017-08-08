class Permutations
{

	public static void main(String args[])
	{

		permutations("abcde");
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