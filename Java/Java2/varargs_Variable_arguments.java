
public class varargs_Variable_arguments 
{

	public static void main(String[] args) 
	{
		Display obj = new Display();
		obj.show(5,6,7,8);
	}

}
class Display
{
	public void show (int ...a)            //varargs-> variable arguments    and ...means many parameter
	{
		for(int i :a)                   //enhanced for loop
		{
			System.out.println(i);
			
		}
	}
	
	public void show (int a)            //method override
	{
		System.out.println(a + " in show a");
		//if only one element then this method called
	}
}