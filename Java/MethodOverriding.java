class a
{
	public void show()
	{                                            //class b method override class 
	System.out.println("in a");
	}
}
class b extends a
{
public void show()
{                                            //class b method override metod of class a 
System.out.println("in b");
}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		b obj = new b();
		obj.show();

	}

}
