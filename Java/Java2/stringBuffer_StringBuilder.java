
public class stringBuffer_StringBuilder
{
   public static void main (String args[])
   {
	   StringBuffer sbr = new StringBuffer("sudarshan ");
	   sbr.append("Pathar");

	   sbr.replace(0, 5, "Nandur");
	   sbr.delete(6,10);
	   System.out.println(sbr);
	   
   }
}
