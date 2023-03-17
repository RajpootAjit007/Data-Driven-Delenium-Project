
public class Big_num {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 8 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (max < a[j]) {
					max = a[j];
				}

			}

		}
		System.out.println(max);

	}

}
