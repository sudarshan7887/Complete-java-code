
// 'this' is a keyword used in java to refer the constructor of same class.it can be used
//     inside the method of constructor of class it can be used to refer any member of 
//        current object from within an instance method or a constructor
public class This_keyword
{

	public static void main(String[] args) 
	{
	  ab obj = new ab(6);
	  obj.show();
	}

}

class ab
{
	private int x;     //x=instance variable
	
	public ab(int x)   //x=local variable   
	{
	  this.x = x;			//current instance
		
	}
	public void show()
	{
		System.out.println("x is:"+x);
	}
}