
class Shape
{
	public void area()
	{
	
		System.out.println("display area:");
	}
}
class triangle extends Shape
{
	public void area(int l,int h)
	{
		System.out.println((1/2)*l*h);
	}
}
class circle extends triangle
{
	public void area(int r) {
		 System.out.println((3.14)*r*r);
	}
    
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		circle c1 =new circle();
		c1.area(4);

	}

}
