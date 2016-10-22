import java.util.*;
import java.io.*;

class Tower
{

	private Stack<Integer> disks;
	private int index;

	public Tower(int i)
	{
		index = i;
		disks = new ArrayList<Integer>();
	}

	public addDisks(int disk)
	{

		if (this.disks.top >= disk)
		{
			System.out.println("Disk in in-appropriate place");
			return;
		}

		this.disks.push(i);

	}

	public removeDisk(int disk)
	{

		this.disks.pop();
	}

	public void moveDisks(int n, Tower source, Tower destination, Tower buffer)
	{
		if (n <= 0)
			return;

		moveDisks(n - 1, source, buffer, destination);
		System.out.println("Moving disk " + n +  " from " + source + " to " + destination);
		moveDisks(n - 1, buffer, destination, source);
	}

}

public class TowerOfHanoi
{
	public static void main(String args[])
	{

		Tower[] towers = new Tower[3];
		for (int i = 0; i < 3; i ++)
		{
			towers[i] = new Tower(i);
		}

		for(int i = 3; i > 0; i --)
		{
			towers[0].disks.push(i);
		}

		moveDisks(3, towers[0], towers[1], towers[2]);
	}
}