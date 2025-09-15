package com.exceptions;
import java.io.*;

public class CheckedExceptionExample 
{

	public static void main(String[] args) 
	{
		try
		{
			//may throw IOException (Checked Exception)
			//This is called as Try-with Resource
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\Exception.txt"));
			String var1 = br.readLine();
			System.out.println(var1);
			br.close();
		}
		catch(IOException ioe)
		{
			System.out.println("An error occured "+ioe.getMessage());
		}
		

	}

}
