package string_example;

public class first_duplicate {
	
	public static void main(String[]args)
	{
		int [] a= {1,5,3,4,5,2,3,4};
		//int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&& (i!=j))
				{
					System.out.println(a[j]+" ");
					//temp++;
					//break;
				}
				
			}
			//if(temp>0)
				//break;
		}
		
	}

}
