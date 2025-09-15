package com.collections;

import java.util.Stack;

public class StackExample 
{

	public static void main(String[] args) 
	{
		Stack<String> fruits = new Stack<>();
		
		//Adding element
		fruits.push("Mango");
		fruits.push("Banana");
		fruits.push("Grapes");
		fruits.push("Apple");
		fruits.push("Watermelon");
		System.out.println("Fruits: "+fruits);
		
		//Showing Top Element
		String Topelement=fruits.peek();
		System.out.println("Top Element: "+Topelement);
		
		//Displaying Removed Element
		String Removeelement=fruits.pop();
		System.out.println("Removed element: "+Removeelement);
		
		//After Removal printing Fruits Stack
		System.out.println("After Removal: "+fruits);
		
		//Iterating the stack
		System.out.println("Iteration: ");
		for(String frt:fruits)
		{
			System.out.println(frt);
		}

	}

}
