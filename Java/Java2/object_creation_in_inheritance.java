class A
  {
	public A()
		{
			System.out.println("In const A");
		
		}
	public A(int i)
		{
			System.out.println("In const int A");
		}
  }
class B extends A
  {
	public B()
		{
			System.out.println("In const B");
		}
	public B(int i)
		{
			System.out.println("In const int B");
		}
  }
public class object_creation_in_inheritance 
{

	public static void main(String[] args) 
	{
//		B obj = new B();
		
//		B obj = new B(5);
		
		A obj = new B(5);
		
				
	}

}
