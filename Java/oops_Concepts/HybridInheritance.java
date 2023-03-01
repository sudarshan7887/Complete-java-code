class SHape
{
	public void area()
	{
	
		System.out.println("display area:");
	}
}
class triangle2 extends SHape
 {
	public void area(int l,int h)
	{
		System.out.println((1/2)*l*h);
	}
}
class circle2 extends SHape
{
	public void area(int r) {
		 System.out.println((3.14)*r*r);
	}
    
}
class EquilatralTriangle extends circle2
{
	public void area(int l,int h)
	{
		System.out.println(0.5*l*h);
	}
}
public class HybridInheritance 
{

	public static void main(String[] args)
	{
		EquilatralTriangle e1= new EquilatralTriangle();
		e1.area(2, 3);
	}

}
