
public class rev2 {
	
	public static String ispelindrome(String str)
	{
		String s = " ";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			s = s+str.valueOf(ch);
		}
		return s;
	}
	
	public static void main(String[]args)
	{
		System.out.println(ispelindrome("ajit"));
	}

}
