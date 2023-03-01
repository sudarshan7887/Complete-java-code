class Ab extends Object // super class
//Every super class extends object by default
{
	public Ab() {
		System.out.println("In const Ab");
	}

	public Ab(int i) {
		System.out.println("In const Ab para");
	}
}

class Pq extends Ab // Sub class
{
	public Pq() {
		System.out.println("In const Pq");
	}

	public Pq(int i) {
		super(i);
//		     super is a keyword used in java to refer the super class or base class 
//          super class method overridden method can be invoked through the use of the keyword super
//		    it can also be used to refer to a hidden field
		
		System.out.println("In const Pq para");
	}
}

public class Super_keyword {

	public static void main(String[] args) {
		Pq obj = new Pq(4);

	}

}
