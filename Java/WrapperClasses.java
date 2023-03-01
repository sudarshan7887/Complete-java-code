



public class WrapperClasses 
{

	public static void main(String[] args) 
	{
		int i = 5;                       //primitive datatype
		//Integer ii = new Integer(5);    //Wrapper class

		Integer ii = new Integer(i);   //Boxing or Wrapping
		
		int j = ii.intValue();        //unboxing or unwrapping
		
		Integer value = i;          //Autoboxing
		
		int k = value;             //autounboxing
		
		System.out.println(i);
		System.out.println(ii);
	}

}
