 package string_example;

import java.util.Scanner;

public class count_vowel_andall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		int vow = 0, con = 0;
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ')
				continue;
			 if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o'
					|| ch == 'O' || ch == 'u' || ch == 'U')
				vow++;

			else
				con++;

		}
		System.out.println("number of vowel present in the sentence" + " " + vow);
		System.out.println("number of consonent present in the sentence" + " " + con);
		
	}

}
