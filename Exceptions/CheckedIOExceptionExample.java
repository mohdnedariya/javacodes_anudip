package com.exceptions;
import java.io.*;

public class CheckedIOExceptionExample 
{

	public static void main(String[] args) 
	{
		 // try-with-resources ensures the reader is always closed
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\acer\\OneDrive\\Desktop\\Exception.txt"))) {
            StringBuilder content = new StringBuilder(); // <-- "object" to hold entire file
            String line;
            // Read the entire file
            while ((line = reader.readLine()) != null) {
            	content.append(line).append(System.lineSeparator());
            }
            // Print the entire content at once         
            System.out.print(content.toString());
            
            //Append a line at the end
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\Exception.txt",true)))
            {
            		writer.write("this is an Exception File");
            		writer.newLine();
            }
            System.out.println("Appended after reading the file");
        } catch (IOException e) {
            //System.out.println("An error occurred: " + e.getMessage());
        		e.printStackTrace();
        }
    }

}


