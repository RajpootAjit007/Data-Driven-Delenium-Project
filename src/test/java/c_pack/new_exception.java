package c_pack;

import org.testng.annotations.Test;

public class new_exception {

	@Test(enabled=true)
	public void program_001() {
		System.out.println("this is my first test_ng program");
	}

	@Test
	public void program_002() {
		System.out.println("this is my second test_ng program");
	}

	@Test(timeOut=5000)

	public void program_003() throws InterruptedException {
		System.out.println("this is my third test_ng program");
		Thread.sleep(4000);
		System.out.println("this is my third test_ng program");
		Thread.sleep(4000);
	}
	@Test
	public void program_004() {
		System.out.println("this is my fourth test_ng program");

}
}
