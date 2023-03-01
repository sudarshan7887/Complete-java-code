
public class Lambda_Expression 
{

	public static void main(String[] args) 
	{
		l obj = () -> System.out.println("Hello"); 
					//Lambda Expression
			obj.show();
	}

}
interface l
{
	void show();
}
