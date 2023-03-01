interface lambda
{
	void show();
}
   
     
interface yyy extends lambda
{
	// interface to interface derived in extends keyword and
	// interface to class derived in implements keyword
	
}
interface xfg extends lambda,yyy
{
	//i.e interface supports multiple inheritance
}

   
public class lambda_expression_in_interface
{

	public static void main(String[] args)
	{
		lambda obj =()->System.out.println("in show");
						//This is a lambda expression i.e.code in one line
		obj.show();
		
	}

}
