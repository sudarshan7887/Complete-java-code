import java.util.ArrayList;

@FunctionalInterface
//FunctionalInterface Annotation means only one method declare in interface
interface Pqr
{
	void show();
	
}
class A
{
	public void Abc()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	@Deprecated 
	// Deprecated Annotation means can't used this method
	public void show()
	{
		
	}
	@Override  // 
	    //Override Annotation means Override class A methods
	 @SuppressWarnings("unchecked")
	public void Abc()
	{
		ArrayList obj = new ArrayList();
		System.out.println("in B");
	}
	
}
public class Annotations_Basics 
{

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.Abc();
	}

}
