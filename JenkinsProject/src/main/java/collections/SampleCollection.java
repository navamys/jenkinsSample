package collections;

import java.util.ArrayList;
import java.util.List;

public class SampleCollection {

	public static void main(String[] args) {
		List <String> l1=new ArrayList();  //list with datatype  //non primitive string only without wrapperclass
		l1.add("apple");
		l1.add("orange");
		
		List l3=new ArrayList();  //list without datatype
		l3.add("apple");
		l3.add(1); 
		
		//System.out.println("Generic");  //arraylist with datatype  
		ArrayList <String> l2=new ArrayList <String>();  //non primitive string only without wrapperclass
		l2.add("1");
		l2.add("2");
		System.out.println(l2);
		
		
		System.out.println("non generic");  //arraylist without datatype
		ArrayList l4=new ArrayList();
		l4.add(1);
		l4.add(0, "banana");  //
		l4.add("2");
		System.out.println(l4.size());
		
		
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		System.out.println(l4.contains(1));
		l4.add(null);
		l4.add(null);  
		l4.add("banana");   //allows duplicate elements
		System.out.println(l4);
		
		System.out.println("List using for loop");
		 for(int i=0;i<l4.size();i++) {
			 System.out.println(l4.get(i));
		 }
		 
		 System.out.println("for each loop");  //generic only and for string only
		 for(String j:l2) {
			 System.out.println(j);
		 }

	}

}
