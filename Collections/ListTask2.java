package com.collections;

import java.util.*;

public class ListTask2 
{

	public static void main(String[] args)
	{
		
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Pune");
		cities.add("Nagpur");
		cities.add("Kanpur");
		cities.add("Bangalore");
		cities.addFirst("Mumbai");
		cities.addLast("Navi Mumbai");
		System.out.println("Cities List: "+cities);
		
	}

}
