/*
	Clone :-Clone() is a method in java used for object Duplication
	shallow Cloning :-copy all the fields of a new instance of the same class to the same instance
	Deep Cloning :- The independent of original instance and making changes in clone should not affect original instance
*/




public class Object_Cloning 
{

	public static void main(String[] args) 
	{
		clone obj = new clone();
		obj.i = 5;
		obj.j =  6;
		
		clone obj1 = new clone();
		obj1.i = obj.i;
		obj1.j = obj.j;
		
		obj1.j = 8;
		
		System.out.println(obj);    //5 8
		System.out.println(obj1);   //5 6
		
	}

}
class clone
{
	int i;
	int j;
	
	@Override
	public String toString()
	{
		return "Abc{" + "i=" + i +",j=" + j+'}';
	}
}
