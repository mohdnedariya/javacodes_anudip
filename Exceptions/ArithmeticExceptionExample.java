package com.exceptions;
import java.util.Scanner;

public class ArithmeticExceptionExample 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		try  
		{
			System.out.println("Enter Numerator: ");
			int num = scan.nextInt();
			System.out.println("Enter Denominator");
			int den = scan.nextInt();
			int result = num % den;
			System.out.println("Remainder is: "+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot perform modulo by 0 ");
		}
		
		scan.close();

	}

}
