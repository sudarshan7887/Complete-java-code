class Cal
{
	int num1;
	int num2;
	int result;  
	
	public Cal()                            //define a constructor     //default constructor      
	{                                              
		int num1 = 5;                              //constructor name is same as class name
		int num2 = 5;                            //it does not return any value
		System.out.println("in constructor");    //constructor will be called automaically when the object is created
	}
	public Cal(int n)                   //parameterized construcor
	{
		num1 = n;
		num2 = n;
		
	}
	public Cal(double d)
	{
	num1 = (int)d;
	}
	
	public Cal(double m,int i)
	{
	num2=i;
	}
}
public class constructors 
{
	public static void main(String args[])
	{
		Cal obj = new Cal(8.5);   //constructor called
		
		System.out.println(obj.num1);
	}

}


