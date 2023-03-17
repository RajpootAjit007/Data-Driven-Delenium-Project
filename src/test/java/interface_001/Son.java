package interface_001;

public class Son implements Father,Mother {
	public void care()
	{
		System.out.println("this is mother interface");
		
	}
	public void job()
	{
		System.out.println("this is the father interface");
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.care();
		s.job();

	}

}
