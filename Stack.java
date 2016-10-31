/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Stack
{
	int stack[];
	int top;
	int capacity;
	
	public Stack(int setupCount)
	{
		stack = new int[setupCount];
		capacity = setupCount;
		top = -1;
	}
	
	public void add(int data)
	{
		if (top == capacity)
		{
			return;
		}
		
		top ++;
		stack[top] = data;
	}
	
	public int pop()
	{
		if (top == -1) return -1;
		
		int popT = stack[top];
		top --;
		return popT;
	}
	
	public static void main (String[] args) 
	{
		Stack stack = new Stack(10);
		stack.add(80);
		stack.add(20);
		stack.add(70);
		stack.add(40);
		stack.add(30);
		
		System.out.println (stack.pop());
	}
}