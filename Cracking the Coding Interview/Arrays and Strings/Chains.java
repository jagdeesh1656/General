import java.util.*;

public class Chains
{
	public static void main(String[] args) {
		
		String good = "BEGIN-3;4-3;3-4;2-END";
		String bad = "77-END;BEGIN-8;8-77;11-11";
		Hashtable ht = new Hashtable();

		String[] splits = good.split(";");
		int count1 = splits.length;
		for (String split1 : splits)
		{
			if (!ht.containsKey(split1.split("-")[0]))
				ht.put(split1.split("-")[0], split1.split("-")[1]);
		}

		String value1 = ht.get("BEGIN").toString();
		while (ht.get(value1) != null)
		{
			if (ht.get(value1).toString().equals("END"))
				break;

			String temp = ht.get(value1).toString()
			ht.put(value1, null);
			count1 ++;
		}

	}
}