
public class Swapping 
{

	public static void main(String[] args) 
	{
		//Swap two numbers a and b
		
		int a =5;
		int b =6;
		
		/*
		b=(a+b)-(a=b);
		System.out.println(a + "  " +b);
		
		*/
		
		//OR
		
		/*
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		
		*/
		
		//OR
		
		/*
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		*/
		
        //OR
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : " +a);
		System.out.println("b : " +b);
	}

}
