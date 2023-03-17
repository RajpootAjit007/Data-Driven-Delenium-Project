package Java_program;

import java.util.HashSet;
import java.util.Iterator;

import org.bouncycastle.asn1.isismtt.ocsp.CertHash;

public class set_example {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("ramesh");
		set.add("ankit");
		set.add("animesh");
		set.add("ramesh");
	//	System.out.println(set);
		/*for(int i=0; i<set.size(); i++)
		{
			System.out.println(i);
		}*/
		/*for(String var:set)
		{
			System.out.println(var);
		}*/
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String var = itr.next();
			if(var.equals("ankit"))
			{
			
			System.out.println(var);
			}
		}

	}

}
