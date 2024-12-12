package ReviewAugust05;

public class PolyMethodOverridingChild extends PolyMethodOverridingParent {
	public void display() {
		super.display();
		System.out.println("hello child");
	}

	public static void main(String[] args) {
		PolyMethodOverridingChild obj1=new PolyMethodOverridingChild();
		obj1.display();
		

	}

}
