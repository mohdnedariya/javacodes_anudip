package com.collections;

import java.util.Vector;

public class VectorExample 
{

	public static void main(String[] args) 
	{
		
		Vector<String> city = new Vector<>();
		city.add("Mumbai");
		city.add("Pune");
		city.add("Vashi");
		city.add("Pune");
		city.add("Thane");
		System.out.println("Cities: "+city);
		
		//Inserting at specific Index
		city.add(2, "Nagpur");
		System.out.println("Cities: "+city);
		
		//Access Element by Index
		System.out.println("Element at Index 3: "+city.get(3));
		
		//Remove an Element
		city.remove("Pune");
		System.out.println("After removal the cities are: "+city);
		
		//Iterating through Vector
		System.out.println("Iterating Vector ");
		for(String cities:city)
		{
			System.out.println(cities);
		}
	}

}
