//lambda expression is only possible in functional interface

interface Lambda
{
	void show();
}
public class LamdaExpression 
{
	

	public static void main(String[] args) 
	{
		
Lambda obj = ()->System.out.println("i am the best");      //lambda expression
obj.show();
	}

}
