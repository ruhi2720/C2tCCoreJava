package com.capgemini.javaprograms;

public class Loop_1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		{	
			int number = 8;
			boolean  Prime = true;
			for(int i = 2; i<number/2; i++)
			{
				if(number % i == 0)
				{
					 Prime = false;
				}
			}
			if(Prime == true)
			{
	System.out.println("The number is a prime number");
			}
			else
			{
	System.out.println("The number is not a prime number");
			}
	}
}
}