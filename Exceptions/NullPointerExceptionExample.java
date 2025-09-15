package com.exceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String var1 = null;

        try
        {
        // This will throw NullPointerException at runtime
        System.out.println("Enter your name: " + var1.length());
        }
        
        catch(Exception e)
        {
        // This line will never be executed because the program crashes above
        System.out.println("Name value cannot be Null");
        }
    }
}