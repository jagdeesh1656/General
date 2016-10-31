import java.util.*;
import java.io.*;

public class Combinations
{


	private static void getCombinations(String givenString, int number)
	{
		getCombs(givenString, "");
	}

	public static void main(String[] args) 
	{
		
		String givenString = "Amandoi";
		int n = 2;
		getCombinations(givenString, n);
	}

	private static void getCombs(String combinations, String soFar)
	{

		String result = null;

		if (combinations.length() == 0 || soFar.length() == 2)
		{

			if(soFar.length() == 2)
			{

				System.out.println(soFar);
			}
		}

		getCombs(combinations, soFar + combinations.charAt(0));
		getCombs(combinations, soFar);
	}
}