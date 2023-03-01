
class Student1
{
	int Rollno;
	String name;
	String subject;
	
	
	    public void Info()
	    {
	    	System.out.println(this.Rollno);
	    	System.out.println(this.name);
	    	System.out.println(this.subject);
	    }

 Student1()       //constructor
 {
	System.out.println("this Default Constructor"); 
 }
}
public class Constructor 
{

	public static void main(String[] args)
	{
		Student1 s1 = new Student1();
		s1.Rollno = 50;
		s1.name = "pansare";
		s1.subject = "java";
		
		s1.Info();
	}

}
