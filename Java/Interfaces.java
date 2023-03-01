

interface writer
{
	void write();
	// interface do not having any method it only declare it
}

class pen implements writer
{
	public void write()
	{
		System.out.println("i am a pen");
	}
}

class pencil implements writer
{
	public void write()
	{
		System.out.println("i am a pencil");
	}
}
class kit
{
	public void doSomething(writer p)
	{
		p.write();
	}
}
class Interfaces 
{

	public static void main(String[] args) 
	{
		kit k = new kit();
		writer p = new pen();
		writer pc = new pencil();
		// we cannot create object of interfaces
		
		k.doSomething(pc);
		k.doSomething(p);
	}

}
