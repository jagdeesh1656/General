public class StaticKeyword
{
	int instanceVariable = 5;
	static int staticVariable = 5;

	public static void main(String args[]) 
	{
		// System.out.println(instanceVariable); -- errors out as the program will not create a location in memory for class's instance varaibles
		/**
			StaticKeyword sk = new StaticKeyword();
			System.out.println(sk.instanceVariable); -- will work as we have created and instantiated a new object of StaticKeyword and that creates an instanceVariable in memory
		**/

		System.out.println(staticVariable); // staticVariable has only one reference in memory i.e. it's created only one time (when the class is compiled) and then the same instance of the variable is used everytime you refer/modify it.
	}
}