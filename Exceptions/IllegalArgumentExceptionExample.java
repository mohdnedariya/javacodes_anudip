package com.exceptions;

public class IllegalArgumentExceptionExample 
{
	public static void setAge(int age)
	{
		if(age < 0)
		{
			throw new IllegalArgumentException("Age cannot be negative");
		}
		else
		{
		System.out.println("Age is : "+age);
		}
	}
	public static void main(String[] args) 
	{
		setAge(25);
		setAge(-10);

	}

}
