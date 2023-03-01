
//method overriding->in two methods have same name and same parameters in two different class

class p   //method overriding,late binding,dynamic binding,run time polymorphism
{
	public void show()
	{
		System.out.println("In show p");
	}
}
class q extends p
{
	public void show()
	{
		System.out.println("In show q");
	}
}
public class method_overriding_polymorphism 
{

	public static void main(String[] args)
	{
		q obj = new q();
		obj.show();
		
	}

}
