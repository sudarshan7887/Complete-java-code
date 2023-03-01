/*
 	inner class means class inside a class.  
*/
public class Inner_Member_Class
{

	public static void main(String[] args) 
	{
		A a =  new A();
		A.B obj = a.new B();
		obj.show();
	}

}
	class A
	{
		int Sid;
		String sname;
		
		class B
		{
			public void show()
			{
				System.out.println("Hello");
			}
		}
	}