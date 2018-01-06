package com.example.numtowrod;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		NumbertoWord app = new NumbertoWord();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int val = -1;
		System.out.println("*** Number to word Program.... Press 0 to exit:********** ");
		while (true)
		{
			
		try {
			System.out.println("***Enter number ****");
			 val = scan.nextInt();
			 if (val == 0)
				{
					break;
				}
				
			 System.out.println("***You entered : "+val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Invalid Number");
			return;
		}
		
	   System.out.println("The output in words is: "+app.numbertoword(val));
		}
		System.out.println("*** Bye ****** ");
	}

}
