package my_program;

import java.util.Scanner;

public class count_vow_conso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		int vow = 0;
		int con = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == ' ')
			continue;
			if (ch == 'a' || ch == 'A' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' || ch == 'O' || ch == 'E'
					|| ch == 'U' || ch == 'I')
				vow++;
			else
				con++;
		}
		System.out.println("number of vowel present in the sentence" + " " + vow);
		System.out.println("number of conso present in the sentence" + " " + con);
	}

}
