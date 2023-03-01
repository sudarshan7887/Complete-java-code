
final class M                       //no one can extended this class
{
	public final void show()       // no one can override tis method
	{
		System.out.println("In M show");
	}
}

//eg

/*
           class G extends M
           {
	           public void show()
	           {
	           System.out.println("In G show");
	           }
           }

*/
//class its not working because M is a final class and 
//method show() is not working because show is a final method

class FinalKMethod
{
	
		

	public static void main(String[] args)
	{
		
      M obj = new M();
      
      obj.show();
      
	}

}

