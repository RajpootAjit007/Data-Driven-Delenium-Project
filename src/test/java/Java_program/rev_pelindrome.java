package Java_program;

public class rev_pelindrome {
	
	public static void main(String[]args)
	{
		int n = 789;
		int rev = 0;
		while(n>0)
		{
		int num=n%10;
		rev=rev*10+num;
		n=n/10;
		}
		System.out.println(rev);
		
	}

}
