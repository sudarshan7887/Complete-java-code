interface pqrs
{
	static void show() 
	{
		System.out.println("Static method in interface");
	}
}
public class static_method_in_interface 
{

	public static void main(String[] args) 
	{
		pqrs.show();
	}

}
