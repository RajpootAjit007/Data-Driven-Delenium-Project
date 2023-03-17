package array;

public class max_number {
	public static void main(String[]args)
	{
		int [] a = {1,2,3,4,5,5,8,7,9,10};  
		int max=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(max<a[j])
				{
					max=a[j];
				}
			}
		}
		System.out.println(max);
	}

}
