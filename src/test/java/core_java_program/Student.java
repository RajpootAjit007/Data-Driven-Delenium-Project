package core_java_program;

public class Student {
	
	private String name;
	private int age;
	private int roll;
	public void setname(String name) {
		this.name=name;
		
	}
	public void setage(int age)
	{
		if(age>0 && age<100)
		{
			this.age=age;
		}
		else
		{
			System.out.println("you are entering invalid age");
		}
	}
	public void setroll(int roll)
	{
		this.roll=roll;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public int getroll()
	{
		return roll;
	}
			

}
