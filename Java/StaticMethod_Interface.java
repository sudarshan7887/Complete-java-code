interface inter
{
	int num =8;    //variable inside the interface is constant or final
	void qwe();
	
	static void show()
	{
		System.out.println("hii");
		
	}
}
 class interimp implements inter
 {
  public void qwe()
  {

	  //num = 9;    it can gives a error because num is const because it declare in interface
  }
 }
public class StaticMethod_Interface 
{

	public static void main(String[] args) 
	{
		
		inter.show();
		
	}

}
