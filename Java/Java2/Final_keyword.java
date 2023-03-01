//final keyword can be used with variable to make it constant
//           it can be used with method to stop overriding
//           it can be used with class to stop inheritance


public class Final_keyword 
{

	public static void main(String[] args) 
	{
		final int i =6;
//                i =7;    //it cannot change i value because i=6 is final variable
		    System.out.println(i);
		    
		    
//		    key obj = new key();
		    lmn obj = new lmn();
		    obj.show();
	}

}
final class lmn
{
	final public void show()
	{
		System.out.println("In show lmn");
	}
	
}
/*
    class key extends lmn       //this class cannot inherit/extends because lmn is final class
{

//	public void show()     //This method cannot  override because above show method is final
	{
		System.out.println("In show key");
	}
}
*/