package com.exceptions;

import java.util.Scanner;

public class ArrayIndexOutofBoundExample 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int arr1 [] = new int [5];
		
		for(int i = 0 ;i < arr1.length ; i++)
		{
			System.out.println("Enter the number at index " + i + " ");
			arr1[i] =scan.nextInt();
		}
		
		try
		{
			System.out.println("the number at index 5 is "+arr1[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("the value should be within the array length");
		}
		

	}

}
