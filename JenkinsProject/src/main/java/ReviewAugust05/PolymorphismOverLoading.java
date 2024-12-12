package ReviewAugust05;

public class PolymorphismOverLoading {
	static int a;
	public static void display() {
		System.out.println("display");
	}
	public static void display(int a) {
		System.out.println("display: "+ a);
	}
	public static void main(String[] args) {
		PolymorphismOverLoading.display();
		PolymorphismOverLoading.display(5);
		

	}

}
