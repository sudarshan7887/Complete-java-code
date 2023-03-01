//The ability of an object to take a many forms is known as polymorphism
//types-> compile time polymorphism and run time polymorphism


//   method overloading -> same name different parameter


class poly     //method overloading,early binding,static binding,compile time polymorphism
{
	public void show()
	{
		System.out.println("Hello");
		
	}
	public void show(int i)
	{
		System.out.println("Hello " +i);
		
	}
	public void show(double d)
	{
		System.out.println("Hello " +d);
	}
}
public class polymorphism 
{

	public static void main(String[] args) 
	{
		poly obj = new poly();
		obj.show(5.5);
		

	}

}
