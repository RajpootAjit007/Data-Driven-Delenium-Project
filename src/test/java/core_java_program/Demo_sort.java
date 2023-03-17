package core_java_program;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_sort {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);
		System.out.println(al);
		System.out.println("after sorting");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("after sorting in reverse");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		

	}

}
