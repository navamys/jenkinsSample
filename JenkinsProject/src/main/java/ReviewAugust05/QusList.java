package ReviewAugust05;

import java.util.ArrayList;
import java.util.List;

public class QusList {
	
	public static void main(String[] args) {
		
		List <Integer> l1=new ArrayList <Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
	
		System.out.println(l1);
		System.out.println("for each loop");
		for(int i:l1) {
			System.out.println(i);
		}
	}
}
