
public class print_Ascii_values 
{

	public static void main(String[] args) 
	{
		//ascii=7byte
		//7byte=2^7=128
		//i.e 0-127
		
		for(int i=0;i<=127;i++)
		{
			System.out.printf("%d : %c \n" ,i,i);
		}
	}

}
