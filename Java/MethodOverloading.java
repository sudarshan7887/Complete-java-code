class Casio
{
	public void add(int i,int j)
	{
	System.out.println(i+j);
	
}
	public void add(int i,int j,int k)
	{
	System.out.println(i+j+k);
	
}
	public void add(double i,double j)
	{
	System.out.println(i+j);
	
}
}
//multiple method in same name but different parameter is called method overloading
public class MethodOverloading 
{
	public static void main(String args[])
	{
	Casio obj = new Casio();
	obj.add(5, 2);
	
	obj.add(5, 2,7);
	
	obj.add(5.6, 2.6);
	}

}
