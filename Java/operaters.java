
public class operaters 
{
	public static void main(String args[])
	{
		//Arithmatic operators
		int a = 10,b = 3;
		int add = a+b;
		int sub = a-b;
		double div = a/b;
		int mul = a*b;
		int mod = a%b;
		System.out.println("the addition of a and b is:"+add);
		System.out.println("the substraction of a and b is:"+sub);
		System.out.println("the division of a and b is:"+div);
		System.out.println("the multiplication of a and b is:"+mul);
		System.out.println("the remender of a and b division is:"+mod); //find remender in division
		
		
		//Bitwise operators
		int m =4;
		int n= 5;
		
		//  ++n is a pre increment operator
		//  n++ is a post incriment operator
	    //  --n is a pre decrement operator
	   //  n-- is a post decriment operator 
		
		m = n++;
		System.out.println(m);
		System.out.println(n);
		
		
		//ternery operator
		//syntax ?:->condition?exp1:exp2
		int i =5;
		int j = 0;
		
//		if(i>6)
//			j =1;
//		else
//			j =2;

		//commented part in one line using ternary operator
		
		j = i>6?1:2;
		
		System.out.println(j);
		
		
		
		
	}

}
