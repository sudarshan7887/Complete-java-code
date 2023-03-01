

class xy
{
	public void abc()
	{
		System.out.println(" xy abc");
	}
}
class pq extends xy
{
	public void abc()    //method overriding
	{
		super.abc();    //used to hidden field of abc method
		System.out.println("pq abc" );
	}
}
public class Super_keyword_in_obj 
{

	public static void main(String[] args)
	{
		pq obj = new pq();
		obj.abc();

	}

}
