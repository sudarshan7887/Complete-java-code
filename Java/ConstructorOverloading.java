class Over
{
	int num1;
	int num2;
	String operation;
	
	public Over()
	{
		num1 = 0;
		num2 = 0;
		operation = "nothing";
	}
	public Over(int i)
	{
		num1 = i;
		num2 = 0;
		operation = "nothing";
	}
	public Over(int i,int j,String op)
	{
		num1 = i;
		num2 = j;
		operation = op;
	}
	
	

}
public class ConstructorOverloading 
{
	public static void main(String args[])
	{
		Over obj = new Over(4,5,"add");
		
	
		System.out.println("This is constructor overloading");
		
	}	

}
