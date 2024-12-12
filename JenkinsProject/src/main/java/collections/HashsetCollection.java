package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetCollection {

	public static void main(String[] args) {
		Set s1=new HashSet();  //nongeneric set
		s1.add(1);
		s1.add("Anu");
		s1.add('b');
		
		Set <String> s2=new HashSet /*<String>*/();  //generic set
		s2.add("Apple");
		s2.add("Orange");
		
		
		HashSet s3=new HashSet();  //nongeneric hashset
		s1.add(1.5f);
		s1.add("Hello");
		s1.add('h');
		
		HashSet <String> s4=new HashSet <String>();  //generic hashset
		s4.add("Football");
		s4.add("Cricket");
		
		s4.remove("Football");  //only object
		System.out.println(s4);
		
		s2.addAll(s4);
		System.out.println(s2);
		
		s2.removeAll(s4);
		System.out.println(s2);
		
		System.out.println(s2.size());
		System.out.println(s2.contains("Apple"));
		
		Iterator <String> i= s2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		i.remove(); 
		System.out.println(s2);
		
		
		
		
		
		

	}

}
