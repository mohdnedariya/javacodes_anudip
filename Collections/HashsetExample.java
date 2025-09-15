package com.collections;
import java.util.*;

public class HashsetExample 
{

	public static void main(String[] args) 
	{
				//Using Set
				Set<Integer> num = new HashSet<>();
				num.add(5);
				num.add(56);
				num.add(5);
				System.out.println("List 1: "+num);
				
				
				Set<String> fruits = new HashSet<>();
				fruits.add("Mango");
				fruits.add("Grapes");
				fruits.add("Apple"); 
				fruits.add("Banana");
				fruits.add("Mango");
				
				System.out.println("Fruits: "+fruits);
				
				System.out.println("Contain Pineapple: "+fruits.contains("Pineapple"));
				

	}

}
