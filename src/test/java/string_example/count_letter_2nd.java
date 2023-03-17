package string_example;

import java.util.Scanner;

public class count_letter_2nd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		int uc=0, lc=0, digit=0, spcl=0;
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
		System.out.println("number of lowercase letter"+" "+ lc);
		System.out.println("number of uppercase letter"+" "+ uc);
		System.out.println("number of digit"+" "+ digit);
		System.out.println("number of special character"+" "+ spcl);



	}

}
