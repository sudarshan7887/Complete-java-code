
class This
{
	int num1;
	int num2;
	int result;  
	
	public This(int num1,int num2)                                  
	{                                              
		this. num1 = num1;     //current object                           
		this.num2 = num2;                            
		System.out.println("in constructor");    
	}
	
}
	
	
public class This_keyword 
{
	public static void main(String args[])
	{
	     This obj = new This(8,5);   //constructor called
		
		System.out.println(obj.num1);
	}

}


