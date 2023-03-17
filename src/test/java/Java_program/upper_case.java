package Java_program;

public class upper_case {
	
	public static void main(String[]args)
	{
		String word = "AJIT";
		char[] ch =word.toCharArray();
		for(int i=0;i<=word.length()-1;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				ch[i] = (char)(ch[i]+32);
			}
		}
		String str = new String(ch);
		System.out.println(str);
	}

}
