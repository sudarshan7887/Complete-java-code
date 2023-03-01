//Encapsulation -->Binding data with methods
//need of encapsulation is safe your data

class Student
{
	private int rollno;
	private String name;
	
	//variables are private and methods are public called encapsulation
	
	
	// Getters and Setters method
	
	
	public void setRollno(int r)
	{
		rollno = r;
		
	}
	public void setName(String s)
	{
		name = s;
		
	}
	
	public int getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name ; 
	}
}


public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		s1.setRollno(35);
		s1.setName("Sudarshan");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
       
	}

}
