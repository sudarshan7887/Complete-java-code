class c implements intf
{
	public void show()
	{
		System.out.println("This is type of interface");
	}
}
interface intf
{
	
}
public class marker_interface 
{

	public static void main(String[] args) 
	{
		c obj = new c();
		if(obj instanceof intf)
		{
			obj.show();
		}
			else
			{
				System.out.println("no p");
			}
				
		
			
		
	}

}
