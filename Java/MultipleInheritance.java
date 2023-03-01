
	class Animal
		{
			   void eat()
			{
			System.out.println("it is eating");
			}
		}
		class Cat extends Animal
		{
				   void run()
	              {
				  System.out.println("it is running");
		          }
		}
		class BabyDog extends Cat
		{
					   void weeping()
					{
					 System.out.println("it is weeping");
					}
		}
 class MultipleInheritance
{
public static void main(String args[])
{
  BabyDog d = new BabyDog();
  
  Cat c = new Cat();
  c.eat();

  d.run();
   d.weeping();
}
}