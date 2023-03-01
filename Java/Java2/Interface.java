/*
		 java does not support multiple inheritance but 
		 with the help of "interface" we can use multiple inheritance in java
		  interface are not classes,however and an interface can extend more than one parent interface.
		  the extends keyword is used once,and the parent interfaces are declared in a comma-separated list.
		  
		1)  interface helps to use multiple inheritance in java and
		2)  it provides it securities
*/


interface Abcd
{
	void show();
					//by default every method in interface is public abstract we don't have to mention
}
class AbcdImpl implements Abcd
{
	public void show()
	{
		System.out.println("in show");
	}
	
}
public class Interface 
{

	public static void main(String[] args)
	{
		Abcd obj = new AbcdImpl();
		                         
		obj.show();
	}

}
