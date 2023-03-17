package string_example;

import java.util.Scanner;

public class tochar_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		char ch []= str.toCharArray();
		int vow = 0, con = 0;
		for (int i = 0; i <str.length(); i++) {
			
			if (ch[i] == ' ')
				continue;
			else if (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o'
					|| ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U')
				vow++;

			else
				con++;

		}
		System.out.println("number of vowel present in the sentence" + " " + vow);
		System.out.println("number of consonent present in the sentence" + " " + con);
	}

}



