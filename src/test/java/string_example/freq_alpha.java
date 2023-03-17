package string_example;

public class freq_alpha {

	public static void main(String[] args) {
		String word="ajitAJITajit";
		char[] ch=word.toCharArray();
		int count[]=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				count[ch[i]-65]++;
			else if(ch[i]>='a' && ch[i]<='z')
				count[ch[i]-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i+97)+" "+(char)(i+65)+" "+count[i]);
			
		}
		

	}

}
