
public class Class_ForName 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");

	}

}
class Abc
{
	static
	{
		System.out.println("In Static");
	}
	
	//instance
	
	{
		System.out.println("In Instance");
	}
}
class Pqr
{
	
}