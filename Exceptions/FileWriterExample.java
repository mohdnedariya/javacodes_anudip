package com.exceptions;
import java.io.*;

public class FileWriterExample
{
    public static void main(String[] args) 
    {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\Test.txt"))) 
            {
            bw.write("First line using FileWriter + BufferedWriter.\n");
            bw.write("Second line.\n");
            }
            catch (IOException e) 	
            {
            e.printStackTrace();
            }
    }
}

