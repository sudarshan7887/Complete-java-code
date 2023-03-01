class Student5
{
		int age;
		String name;
		public void PrintInfo(int age)
			{
				System.out.println(age);
				
			}
		public void PrintInfo(String name)
			{
				System.out.println(name);
				
			}
		public void PrintInfo(int age,String name)
			{
				System.out.println(age+""+name);
				
			}
}
//function overloading - in one class same function create many time  i.e PrintInfo

public class Polymorphism 
{

	public static void main(String[] args) 
	{
		
Student5 s1 = new Student5();

s1.age = 22;
s1.name = "Sudarshan";

s1.PrintInfo(s1.age, s1.name);
	}

}
