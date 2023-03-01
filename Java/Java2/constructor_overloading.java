
public class constructor_overloading 
{

	public static void main(String[] args) 
	{
		ABC obj =new ABC();
//		ABC obj =new ABC(5);
//		ABC obj =new ABC(5,6.6);
		
	}

}
class ABC
{
	public ABC()                //constructor overloading
	{
		System.out.println("In ABC Const");
		
	}
	public ABC(int i)
	{
		System.out.println("In ABC const Para");
	}
	public ABC(int i,Double d)
	{
		System.out.println("In Abc const intDouble");
	}
}
