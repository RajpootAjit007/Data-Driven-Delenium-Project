package core_java_program;

public class reverse_number {

	public static void main(String[] args) {
		int a =2458;
		int rev=0;
		while(a>0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			
			a=a/10;
			
		}
		System.out.println(rev);
		
		

	}

}
