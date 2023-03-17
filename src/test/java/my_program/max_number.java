package my_program;

public class max_number {
	
	public static void main(String[]args)
	{
		int [] n= {1,2,3,4,5,6,7};
		int max = n[0];
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(max<n[j])
				{
					max=n[j];
					
			}
		}
		
	}
		System.out.println(max);

}
}
