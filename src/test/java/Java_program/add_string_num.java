package Java_program;

public class add_string_num {
	
	public static void main(String[]args)
	{
		String word = "ajit1023";
		int sum = 0;
		char []ch = word.toCharArray();
		for(int i=0;i<word.length();i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum = sum+ch[i]-48;
			}
			
		}
		System.out.println(sum);
	}

}
