class Pen
{
	String Color;
	String Type;
		public void write()
		{
			System.out.println("print Something");
		}

		public void PrintColor()
		{
			System.out.println(this.Color);
		}
		public void PrintType()
		{
			System.out.println(this.Type);
			
		}
 }



class Student
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
}
public class Classes_Objects 
{

	public static void main(String[] args) 
	{
		Pen p1 = new Pen();
			p1.Color="blue";
			p1.Type ="gel";
		
		p1.write();
		
		Pen p2 = new Pen();
			p2.Color="black";
			p2.Type ="ballpoint";
		
			p1.PrintColor();
			p2.PrintColor();
			
			p1.PrintType();
			p2.PrintType();
			System.out.println("");

			
			Student s1 = new Student();      //object creation
			s1.Rollno =35;
			s1.name = "Sudarshan";
			s1.subject = "Java";
			
			s1.Info();            //method call
	}

}
