package string_example;

public class Convert_small {

	public static void main(String[] args) {
		String word = "AJIT";
		char []ch = word.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
			
		}
		String str=new String(ch);
		System.out.println(str);

	}

}
