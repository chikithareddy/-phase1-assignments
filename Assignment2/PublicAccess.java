package Assignment2;




	public class PublicAccess {
	    public static void main( String[] args ) {
	        // accessing the public class Animal1.java
	        Animal1 animal = new Animal1();

	        // accessing the public variable
	        animal.legCount = 4;
	        // accessing the public method
	        animal.display();
	    }
	}

