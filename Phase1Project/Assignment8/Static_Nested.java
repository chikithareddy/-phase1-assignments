package Assignment8;

public class Static_Nested {
	
	static int u = 90;
	private static void outerMethod() {
		System.out.println(" inside outermethod");
		
	}
	// a static inner class
	static class Inner {
	public static void main(String[] args) {
			 System.out.println("inside inner class method"+ u);
			 outerMethod();
	}
	}
}
	



