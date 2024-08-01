package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleCollection3 {

	public static void main(String[] args) {
		ArrayList <String> l1=new ArrayList<String>();
		l1.add("Anu");
		l1.add("Ram");
		l1.add("common");
		
		ArrayList <String> l2=new ArrayList<String>();
		l2.add("Orange");
		l2.add("Apple");
		l2.add("common");
		System.out.println(l2);
		System.out.println(l2.size());
		System.out.println(l2.contains("Apple"));
		
		/*l1.addAll(l2);   //adding all elements into l1
		System.out.println(l1);
		//l1.removeAll(l2);   
		//System.out.println(l1);
		
		Iterator<String> i=l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());	//method of iterator
		}
		
		i.remove();  //method of iterator, removes last element only
		System.out.println(l1);*/
		
		
		
		
		

	}

}
