class Permutations
{

	public static void main(String args[])
	{


	}

	void permutations(String str)
	{

		permutation(str, "");
	}

	void permutation(String str, String prefix)
	{

		if(str.length() == 0)
		{
			System.out.println(prefix);
			return;
		}

		for(int i = 0; i < str.length(); i ++)
		{

			String remaining = str.substring(0, i) + str.substring(i + 1, n);
			permutation(rem, prefix + str.charAt(i));
		}
	}
}