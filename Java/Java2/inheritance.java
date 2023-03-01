class Add    //parent,base,super class
  {
	int num1,num2,result=0;
		public void sum()
		{
			result = num1+num2;
		}
  }

//child,derived,sub class
	class AddSub extends Add      //single level inheritance
	  {
	     public void sub()
	      {
	    	 result = num1 - num2;
	      }
      }
	class AddSubMul extends AddSub    //mutilevel inheritance
	  {
		public void Multi()
		{
		   result = num1*num2;
	    }
	  }
public class inheritance
{

	public static void main(String[] args) 
	{
		AddSubMul obj = new AddSubMul();
		obj.num1 = 5;
		obj.num2 = 6;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		obj.Multi();
		System.out.println(obj.result);
	
		
	}

}
