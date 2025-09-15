package com.threads;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		Thread message = new Thread(()->{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello World");
				try
				{
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					System.out.println("Exception occured ");
				}
			}
		});
//		Thread count = new Thread(()->{
//			for(int i=1;i<=10;i++) {
//				System.out.println("count: "+i);
//				try {
//	                Thread.sleep(500); 
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//			}
//
//		});
//		
//		Thread square = new Thread(()->{
//			int arr[] = {2,56,7,4,8,9};
//			for(int i=0 ; i<arr.length; i++) {
//				int numsquare = arr[i] * arr[i];
//				System.out.println("Square of "+arr[i]+" is: "+numsquare);
//				try {
//	                Thread.sleep(500);
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//			}
//			
//		});
//		count.start();
//		square.start();
		message.start();
		try
		{
			message.join();
//			count.join();
//			square.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Exception occured");
		}

	}

}
