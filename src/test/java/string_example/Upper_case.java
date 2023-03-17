package string_example;

import java.util.Scanner;

public class Upper_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
				ch[i]=(char)(ch[i]-32);
		}
		String upper = new String(ch);
		System.out.println(upper);

	}

}
