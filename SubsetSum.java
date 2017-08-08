public class SubsetSum
{

	public boolean isSubset(set, number, sum)
	{

		if (sum == 0)
			return true;

		if (sum > 0 && n == 0)
			return false;

		return (isSubset(set, number - 1, sum) || isSubset(set, number - 1, sum - set[number - 1]))
	}

	public static void main(String args[])
	{


	}
}