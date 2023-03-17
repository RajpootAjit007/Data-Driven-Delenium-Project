package string_example;

public class vowel_count {

	public static void main(String[] args) {
		String word="AJITajit";
		char[] ch=word.toCharArray();
		int vow=0;
		int cons=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				System.out.println(ch[i]);
			
				vow++;
			}
			
			
		}
		System.out.println(vow);
		

	}

}
