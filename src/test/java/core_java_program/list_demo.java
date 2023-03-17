package core_java_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class list_demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
        
		al.set(2, "java");
		System.out.println(al);
		al.add(2, "C#");
		System.out.println("By for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i);
		}
		System.out.println("By for each loop");
		for (Object a1 : al) {
			System.out.println(a1);
		}
		System.out.println("By Iterator");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object values = itr.next();
			System.out.println(values);
		}
		

	}

}
