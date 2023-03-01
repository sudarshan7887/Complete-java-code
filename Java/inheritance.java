

class CalculatorA                  //super ,parent,base class
{
	public int add(int i,int j) 
	{
	return i+j;
    }
}
class calAdv extends CalculatorA     //sub ,derived ,child class
{                                     
	
	public int sub(int i,int j) 
	{
	return i-j;
}
}

public class inheritance {

	public static void main(String[] args)
	{
		CalculatorA c1 = new CalculatorA();
		int result = c1.add(34, 6);
		
		calAdv c2 = new calAdv();
		int result1 = c2.add(54, 45);
		int result2 = c2.sub(54, 45);
		
		System.out.println(result);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
