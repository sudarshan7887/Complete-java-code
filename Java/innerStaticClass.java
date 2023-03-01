

class Outer1
{
	static int a;                        //this is a static variable
	
	static public void show()          //This is a static method
	{
}
	static class Inner1                 //this is a static class inside a class
	{
		public void display()
		{
			System.out.println("in display");
	}
}
}
public class innerStaticClass 
{
	public static void main(String args[])
	{
		Outer1 obj = new Outer1();
		obj.show();
		
		Outer1.Inner1 obj1 = new Outer1. Inner1();      //called object of  static inner class
		obj1.display();
	}

}
