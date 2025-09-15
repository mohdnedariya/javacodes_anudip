package com.collections;
import  java.util.*;


public class QueueExample 
{

	public static void main(String[] args) 
	{
		Queue<String> fruits = new LinkedList<>();
		
		//Adding element
				fruits.add("Mango");
				fruits.add("Banana");
				fruits.add("Grapes");
				fruits.add("Apple");
				fruits.add("Watermelon");
				System.out.println("Fruits: "+fruits);
				
				//Showing Top Element
				String Topelement=fruits.peek();
				System.out.println("Top Element: "+Topelement);
				
				//Displaying Removed Element
				String Removeelement=fruits.poll();
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
