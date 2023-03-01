//Generics enables types (classes and interfaces) to be parameters when definning classes
//Generics are also type safe and easier to read
//Generics supports only wrapper classes

import java.util.ArrayList;

class container< T extends Number>
{
	T value;
	
public T getvalue()
{
	return value;
}
public void setvalue(T value)
{
	this.value = value;
}
public void show()
{
	System.out.println(value.getClass().getName());
}
public void demo(ArrayList<? super T> obj)
{
	
}
}
public class GenericsDemo 
{

	public static void main(String[] args)
	{
		container<Integer> obj = new container();
		obj.show();
		obj.demo(new ArrayList<Number>());
	}

}
