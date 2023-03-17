
public class Frequency_count {

	public static void main(String[] args) {
		int []a= {5,2,3,4,4,5,5,3};
		int [] count=new int [6];
		for(int i=0;i<a.length;i++)
		{
			
			
				count[a[i]]++;
				
			
		}
		for(int i=1;i<count.length;i++)
		{
			
			
				System.out.println(count[i]);
				
			
		}
		
		

	}

}
