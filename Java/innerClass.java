class Outer
{
	int a;                        //this is a variable
	
	public void show()          //This is a method
	{
}
	class Inner                 //this is a member class inside a class
	{
		public void display()
		{
			System.out.println("in display");
	}
}
}
public class innerClass 
{
	public static void main(String args[])
	{
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();      //called object of inner class
		obj1.display();
	}

}
