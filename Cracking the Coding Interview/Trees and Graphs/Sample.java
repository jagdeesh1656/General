interface Animal
{
	public void eat();
	public void makeNoise();
}

class Dog implements Animal
{
	public void makeNoise()
	{
		System.out.println("bark");
	}
	public void eat()
	{
		System.out.println("eatDog");
	}
}


abstract class Cat implements Animal
{
	public void makeNoise()
	{
		System.out.println("meow");
	}

}

public class Sample
{
	public static void playWithAnimal(Animal animal)
	{
		animal.eat();
		animal.makeNoise();
	}

	public static void main(String[] args) {

		playWithAnimal(new Dog());
	
	}
}