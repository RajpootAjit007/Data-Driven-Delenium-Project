package string_example;

import java.util.Scanner;

public class count_letters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		int uc=0;
		int lc=0;
		int digit=0;
		int spcl=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90)
			
				uc++;
			
			else if(ch>=97 && ch<=122)
			
				lc++;
			else if(ch>='0' && ch<='9')
				digit++;
			else 
				spcl++;
			
			
		}
		System.out.println("length of uppercase" + " "+uc);
		System.out.println("length of lowercase" + " "+lc);
		System.out.println("length of digit" + " "+digit);  //9731158174
		System.out.println("length of special character" + " "+spcl);

	}

}
