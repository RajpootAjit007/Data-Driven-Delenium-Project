package core_java_program;

public class Son implements Father, Mother {

	
	public void care() {
		
		System.out.println("care from mother");
	}

	
	

	public static void main(String[] args) {
		
		Mother m = new Son();
		Father f = new Son();
		m.care();
		//f.care();
		System.out.println(f.Father_age);
		System.out.println(m.Mother_age);
	}

}
