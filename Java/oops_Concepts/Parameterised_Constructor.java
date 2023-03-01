class Student3
{
	String name;
	int age;
	public void StudInfo()
	{
		System.out.println(this.age);
		System.out.println(this.name);
	}
		Student3(String name,int age)
		{
			System.out.println("This is parameterised constructor:");
			
			
			this.name =name;
			this.age = age;
			
		}
		
	
}
public class Parameterised_Constructor 
{

	public static void main(String[] args)
	{
		Student3 s1 = new Student3("Sudarshan",21);
		
				s1.StudInfo();
	}

}
