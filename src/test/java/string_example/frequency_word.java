package string_example;

import java.util.Scanner;

public class frequency_word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int count[]= new int[128];
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
				
				count[ch[i]-97]++;
			else if(ch[i]>='A' && ch[i]<='Z')
				count[ch[i]-65]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]!=0)
		
		System.out.println((char)(i+65)+" "+ count[i]);

	}
	}

}
