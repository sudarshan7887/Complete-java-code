

class Calculator                   //super ,parent,base class
{
	public int add(int i,int j) 
	{
	return i+j;
    }
}
class calAdva extends Calculator     //sub ,derived ,child class
{                                     //single level inheritance
	
	public int sub(int i,int j) 
	{
	return i-j;
}
}


class calVeryAdva extends calAdva

{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class MultilevelInheritance {

	public static void main(String[] args)
	{
		
		calVeryAdva c3 = new calVeryAdva();
		int result1 = c3.add(54, 45);
		int result2 = c3.sub(7, 6);
		int result3 = c3.mul(5,3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
