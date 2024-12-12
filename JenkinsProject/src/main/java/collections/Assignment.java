package collections;

import java.util.ArrayList;

public class Assignment {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("Green");
		l1.add("Red");
		l1.add("Blue");
		l1.add("Yellow");
		System.out.println("Print out the collection: "+l1);
		System.out.println("To retrieve an element: "+l1.get(1));
		System.out.println("To iterate through all elements: ");
		for(int i=0;i<l1.size();i++) {
			 System.out.println(l1.get(i));
		 }
		l1.remove(2);
		System.out.println("3rd element removed: "+l1);
		System.out.println("Searching an element: "+l1.contains("Yellow"));
	}

}
