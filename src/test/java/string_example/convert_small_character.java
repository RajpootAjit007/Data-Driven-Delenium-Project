package string_example;

import java.util.Scanner;

public class convert_small_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (ch[i] >= 65 && ch[i] <= 90)
				ch[i] =  (char) (ch[i] + 32);
		}
			String lower = new String(ch);
			System.out.println(lower);
			

		}
		

	}


