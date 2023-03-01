/*
 Abstract class
 	An abstract class is a incomplete class 
 	An abstract class can defined with the keyword abstract 
 	we cannot create object of the abstract class because it is not complete.
 	an abstract class can have abstract method
 	These class cannot be instantiated and are either partially implemented or not at all implemented
 	These class is used when common features are shared by all object
 	
 Abstract method
 	 Abstract method are method hat can only be declared not defined
 
 
  */
public class Abstract_class 
{

	public static void main(String[] args)
	{
//		Iphone obj = new Iphone();   we cannot create object of abstract class
//		obj.call();
		vivo obj = new oppo();
		obj.call();
		obj.move();
		obj.cook();
		obj.dance();
	}

}
abstract class Iphone    //abstract class
{
	public void call()
	{
		System.out.println("calling...");
		
	}
	public abstract void move();   //abstract method
	public abstract void dance();
	public abstract void cook();
	
	
}
 abstract class vivo extends Iphone   //abstract class
 {
	 
	 public void dance()
	 {
		 System.out.println("Dancing...");
	 }
 }
 class oppo extends vivo     //concrete class
 {
	 public void move()
	 {
		 System.out.println("moving...");
		 
	 }
	 public void cook()
	 {
		 System.out.println("Cooking...");
	 }
 }

