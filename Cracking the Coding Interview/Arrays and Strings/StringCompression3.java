public class StringCompression3
{
	String compress(String str)
	{
		// int finalLength = countCompression(str);
		// if (finalLength >= str.length()) return str;

		StringBuilder compressed = new StringBuilder(finalLength);
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i ++)
		{
			countConsecutive ++;

			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1))
			{
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}

		return compressed.toString();
	}

	int countCompression(String str)
	{
		int clength = 0;
		int count = 0;

		for (int i = 0; i < str.length(); i ++)
		{
			count ++;

			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1))
			{
				clength = clength + 1 + String.valueOf(count).length();
				count = 0;
			}
		}

		return clength;
	}

	public static void main(String[] args) {
		
		StringCompression3 sc = new StringCompression3();
		System.out.println(sc.compress("aaaabbbbccc"));
	}
}