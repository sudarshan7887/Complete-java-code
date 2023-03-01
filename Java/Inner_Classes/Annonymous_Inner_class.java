/*
 Inner nested class:
 	Inner class is the most imp type of nested class.
 	An inner class is a non-static nested class.
 	it has access to all of the variables and methods of its outer class
  
 Anonymous inner class is one that is not assigned a name
 
 */
public class Annonymous_Inner_class {

	public static void main(String[] args) {
		P obj = new P() {
			public void show() {
				System.out.println("Hii");
			}
		};
		obj.show();
	}

}

class P {
	public void show() {
		System.out.println("Hello");
	}
}
