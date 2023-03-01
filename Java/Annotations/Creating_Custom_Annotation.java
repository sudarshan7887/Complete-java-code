//marker Annotation
//Single value Annotation
//Multivalue Annotation

@interface Smartphone  //creating annotation
{
	String os() default "Symbian";
	int version() default 1;
}
@ Smartphone    //using annotation
class VivoSeries
{
	
}
public class Creating_Custom_Annotation 
{

	public static void main(String[] args) 
	{
		
	}

}
