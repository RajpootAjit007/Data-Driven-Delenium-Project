package Java_program;

public class count_vow {
	
	public static void main(String[]args)
	{
		String word = "ajitu";
		char [] ch= word.toCharArray();
		for(int i=0;i<=word.length()-1;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u')
			{
				System.out.println(ch[i]);
			}
		}
	}

}
