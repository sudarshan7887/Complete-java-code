class student
{
	String name;
	int age;
	public void StudInfo()
	{
		System.out.println(this.age);
		System.out.println(this.name);
	}
	student(student s2)
		{
			System.out.println("This is copy constructor:");
			
			
			this.name =name;
			this.age = age;
			
		}
	student()
	{
		
	}
}		
public class CopyConstructor
{

	public static void main(String[] args) 
	{
		
student s1 = new student();
s1.name ="Sudarshan";
s1.age = 21;
student s2 = new student(s1);

s1.StudInfo();
	}

}
