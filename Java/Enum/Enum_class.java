
public class Enum_class 
{
 enum mobiles
 {
	 Apple(100),Samsung,Vivo(90);
	 int price;
	 
	 mobiles()
	 {
		 price = 80;
		 System.out.println("Constuctor");
	 }
	 mobiles(int p)
	 {
		 price = p;
	 }
	  public int getPrice()
	  {
		  return price;
	  }
 }
	public static void main(String[] args) 
	{
		mobiles m[] = mobiles.values();
		for (mobiles mobile: m)
		{
			System.out.println(mobile);
		}
	}

}
