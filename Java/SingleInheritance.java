
		class Animal_A
		{
		  public void eat()
				{
				System.out.println("it is eating");
				}
        }
		class Dog
		{
			void bark()
				{
				System.out.println("it is barking");
				}
		}
class SingleInheritance
{
			public static void main (String args[])
			{
			Dog d=new Dog();
			Animal a=new Animal();
			d.bark();
			a.eat();
			}
}