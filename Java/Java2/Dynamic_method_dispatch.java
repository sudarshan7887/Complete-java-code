
//   Dyanamic method dispatch run time polymorphism

//  Dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime
class P   
{
	public void show()
	{
		System.out.println("In show P");
	}
}
class Q extends P
{
	public void show()
	{
		System.out.println("In show Q");
	}
}
public class Dynamic_method_dispatch 
{

	public static void main(String[] args) 
	{
		P obj1 = new P();
		Q obj2 = new Q();
		
		P p;         //
		
//		p = obj1;
		p = obj2;
		p.show();
	}

}
