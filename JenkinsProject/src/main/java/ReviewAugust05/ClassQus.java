package ReviewAugust05;

public class ClassQus implements InterfaceQus1,InterfaceQus2 {
	public void display() {
		System.out.println(A);
	}
	public void show() {
		System.out.println(B);
	}

	public static void main(String[] args) {
		ClassQus obj=new ClassQus();
		obj.display();
		obj.show();
		

	}

}
