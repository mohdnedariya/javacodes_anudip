package com.collections;

import java.util.*;

public class ListExample 
{

	public static void main(String[] args) 
	{
		//Using List
		List<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(56);
		num.add(5);
		System.out.println("List 1: "+num);
		
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Fruits: "+fruits);
		
		
		
	}

}
