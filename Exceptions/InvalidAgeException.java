package com.exceptions;
import java.util.*;

//Step 1: define the custom Exception class
 class InvalidAgeException extends Exception
{
	 
	 
	public InvalidAgeException(String message)
	{
		super(message);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		try 
		{
			if(age < 0) 
			{
				//Step 2: throw the Custom Exception
				throw new InvalidAgeException("Age cannot be negative");
			}
			else
			{
				System.out.println("your entered age is: "+age);
			}
		}
		catch(InvalidAgeException ia)
		{
			//Step 3: Handle teh custom Exception 
			System.out.println(ia.getMessage());
		}
	}

}
