package Java_program;

import java.util.Scanner;

public class rev_string {

	public static String Pelindrom(String str) {
		String s = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			s = s + String.valueOf(ch);
		}

		return s;

	}

	public static void main(String[] args) {

		System.out.println(Pelindrom("ajit"));

	}
}
