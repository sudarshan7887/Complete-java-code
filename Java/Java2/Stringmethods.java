
/*
toString is defines inside object class
toString() method is used to java when we want a object to represent String
overriding toString() method will return the specified value
This method can overriden to customize the String representation of the object
*/

public class Stringmethods 
{

	public static void main(String[] args)
	{
		Student s1 = new Student(35,"Sudarshan");
		System.out.println(s1);
		
		
	}

}
class Student
{
	int rollno;
	String sname;
	public Student(int rollno,String sname)
	{
		this.rollno = rollno;
		this.sname = sname;
	}
	
	@Override
	public String toString()
	{
		return "Student{" + "rollno=" +rollno + ",sname=" + sname +'}';
	}
}
