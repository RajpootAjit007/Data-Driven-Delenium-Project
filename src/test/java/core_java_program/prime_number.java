package core_java_program;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println(n+" "+"is not a prime number");
			return;
		}
			
		
	}
			System.out.println(n+" "+"is a prime number");
			
	}
	}
	
	

	
	

