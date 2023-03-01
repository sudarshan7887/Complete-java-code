
interface Demo
{
	void lmn();
	default void show()
	{
		System.out.println("in show");
		
	}
}
class DemoImp implements Demo
{
	public void lmn()
	{
		System.out.println("in lmn");
		
	}


public void show()
{
	System.out.println("in new show");
}
}
public class DefaultMethodInterface 
{

	public static void main(String[] args) 
	{
		Demo obj = new DemoImp();
		obj.lmn();
		obj.show();
	}

}
