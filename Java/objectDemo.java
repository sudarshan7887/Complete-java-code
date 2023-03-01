
class Calc
{
	int num1;
	int num2;
	int result;  //instance variable
	
	public void perform()
	{
		result = num1+num2;
	}
	
}
public class objectDemo {
	
public static void main(String args[])
{
	Calc obj = new Calc();   //new keyword is used to create a object and it is responsible to memory
	obj.num1 = 3;
	obj.num2 = 5;
	obj.perform();
	System.out.println(obj.result);
	
}
}
