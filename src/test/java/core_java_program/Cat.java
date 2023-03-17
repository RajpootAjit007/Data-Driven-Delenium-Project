package core_java_program;

public class Cat extends Demo_abst{
	
	public void bark()
	{
		System.out.println("cat mew");
	}
	
	@Override
	void noise()
	{
		System.out.println("cat mew slow");
		
	}
	@Override
	void run()
	{
		System.out.println("cat runs rapidly");
	}
	
	public static void main(String[]args)
	{
		Cat c = new Cat();
		System.out.println(c.name+" "+c.price);
		c.noise();
		c.run();
		c.bark();
		
		
		
	}

}
