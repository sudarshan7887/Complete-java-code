
class p
{
	public void show()
	{                                            //class b method override class 
	System.out.println("in p");
	}
}
class q extends p
{
public void show()
{                                            //class b method override metod of class a 
System.out.println("in q");
}
 public void config()
 {
	 System.out.println("config");
 }
}
class r extends p
{
	public void show()
	{
		System.out.println("in r");
	}
}
public class DynamicMethodDispatch
{

	public static void main(String[] args) {
		
		p obj = new q();         //runtime polymorphism
		obj.show();
		
		obj = new r();
		obj.show();           //dynamic method dispatch

	}

}
