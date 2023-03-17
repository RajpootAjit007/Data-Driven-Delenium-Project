package testNg_practice;

public class String_rev001 {

	public static String rev(String s) {
		String m = " ";
		for (int i = s.length() - 1; i >= 0; i--)

		{
			char ch = s.charAt(i);
			m = m + String.valueOf(ch);
		}

		return m;
	}

	public static void main(String[] args) {

		System.out.println(rev("ajit"));
	}

}
