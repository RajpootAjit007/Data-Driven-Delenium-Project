package string_example;

public class Pelindrome_string {

	public static void main(String[] args) {

		String st = " Ajit";
		String s;

		char[] ch = st.toCharArray();
		char [] chr = new char[st.length()];

		for (int i = ch.length - 1; i > 0; i--) {

			chr[i]=ch[i];

		}
		
		for( int j =0;j<chr.length;j++) {
			
			System.out.println(chr[j]);
		}
	}
}
