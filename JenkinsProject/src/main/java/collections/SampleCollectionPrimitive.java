package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleCollectionPrimitive {

	public static void main(String[] args) {
		List l1=new ArrayList();   //non generic
		l1.add("apple");
		l1.add(5);
		System.out.println(l1);
		List <Character>l2=new ArrayList();    //generic //character is wrapperclass
		l2.add('a');
		l2.add('b');
		System.out.println(l2);
		
		
		ArrayList l3=new ArrayList();  //non generic
		l3.add("orange");
		l3.add(1.4f);
		System.out.println(l3);
		ArrayList <Integer> l4=new ArrayList <Integer>();   //generic  //integer is wrapperclass
		l4.add(10);   //maintain existing
		l4.add(20);
		System.out.println(l4);
		ArrayList <Float> l5=new ArrayList <Float>(); //generic  //float is wrapperclass
		l5.add(3.7f);
		l5.add(8.4f);
		System.out.println(l5);
		l5.remove(0);
		System.out.println(l5);
		l5.remove(8.4f);
		System.out.print(l5);
		System.out.println(l5.get(1));
		l5.set(0, 1.5f);  //replaced existing element
		System.out.println(l5);
		l5.add(9.5f);
		l5.add(3.4f);
		Collections.sort(l5);
		System.out.println(l5);
		
		

	}

}
