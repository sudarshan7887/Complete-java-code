class Shape1
{
	public void area()
	{
	
		System.out.println("display area:");
	}
}
class triangle1 extends Shape1
 {
	public void area(int l,int h)
	{
		System.out.println((1/2)*l*h);
	}
}
class circle1 extends Shape1
{
	public void area(int r) {
		 System.out.println((3.14)*r*r);
	}
    
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		
circle1 c1 = new circle1();
c1.area(2);
	}

}
